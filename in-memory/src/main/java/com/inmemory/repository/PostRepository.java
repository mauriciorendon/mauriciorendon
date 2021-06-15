package com.inmemory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inmemory.models.Post;

public interface PostRepository extends MongoRepository<Post, Integer>{

}
