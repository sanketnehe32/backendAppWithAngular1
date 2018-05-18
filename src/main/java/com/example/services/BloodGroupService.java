package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.BloodGroup;
import com.example.repository.BloodGroupRepo;

@Service
public class BloodGroupService {
	@Autowired
	BloodGroupRepo bloodGroupRepo;
	
	public BloodGroup save(BloodGroup bloodGroup){
		return bloodGroupRepo.save(bloodGroup);
	}
	public List<BloodGroup> getAll(){
		return bloodGroupRepo.findAll();
	}
}
