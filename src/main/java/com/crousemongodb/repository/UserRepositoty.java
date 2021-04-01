package com.crousemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crousemongodb.domain.User;

@Repository
public interface UserRepositoty extends MongoRepository<User, String>{
	
}
