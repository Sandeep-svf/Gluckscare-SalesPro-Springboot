package com.gluckscare.repository;

import com.gluckscare.entitiy.HeadOfficeEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeadOfficeRepository extends MongoRepository<HeadOfficeEntity, ObjectId> {

}
