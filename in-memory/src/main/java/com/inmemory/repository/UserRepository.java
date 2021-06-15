package com.inmemory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inmemory.models.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{
	
}
