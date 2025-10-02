# Этап сборки (используем Maven и Java 24)
FROM maven:3.9.9-eclipse-temurin-24 AS build
WORKDIR /app

# Копируем pom.xml и загружаем зависимости
COPY pom.xml .
RUN mvn dependency:go-offline

# Копируем исходники и собираем
COPY src ./src
RUN mvn clean package -DskipTests

# Этап запуска
FROM eclipse-temurin:24-jdk
WORKDIR /app

# Копируем собранный JAR
COPY --from=build /app/target/*.jar app.jar

# Переменная окружения для подключения к MongoDB
ENV MONGO_URI=mongodb://mongo:27017/mydb

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
