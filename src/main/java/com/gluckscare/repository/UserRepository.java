package com.gluckscare.repository;

import com.gluckscare.entitiy.UserEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, ObjectId> {

    UserEntity findByUserName (String userName);


    void deleteByUserName(String name);
}
