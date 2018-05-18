package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.domain.BloodGroup;
import com.example.services.BloodGroupService;

@RestController
public class bloodGroupController {
	@Autowired
	BloodGroupService bloodGroupService;
	
@PostMapping("api/addBG")
public BloodGroup test(@RequestBody BloodGroup bloodGroup){
	System.out.println(bloodGroup);
	BloodGroup b= bloodGroupService.save(bloodGroup);
	return b;
}
@GetMapping("api/getBGList")
public List<BloodGroup> getList(){
	return bloodGroupService.getAll();
}
}
