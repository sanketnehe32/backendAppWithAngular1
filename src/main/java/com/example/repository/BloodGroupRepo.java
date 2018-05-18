package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.domain.BloodGroup;


public interface BloodGroupRepo extends MongoRepository<BloodGroup, String>{
	

}
