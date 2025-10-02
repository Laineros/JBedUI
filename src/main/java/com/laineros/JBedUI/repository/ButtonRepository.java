package com.laineros.JBedUI.repository;

import com.laineros.JBedUI.model.ButtonDoc;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ButtonRepository extends MongoRepository<ButtonDoc, ObjectId> {
}
