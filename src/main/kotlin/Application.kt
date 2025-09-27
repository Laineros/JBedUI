package com.FastAndCurious

import com.FastAndCurious.com.bdui.routing.configureRouting
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureHTTP()
    configureSerialization()
    configureDatabases()
    configureMonitoring()
    configureTemplating()
    configureRouting()
}
