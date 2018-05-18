package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blood_group_collection")
public class BloodGroup {

	@Id
	String _id;
	String name;
	String blood_group_type;

	public BloodGroup() {

	}

	public BloodGroup(String blood_group_type, String name) {
		super();
		this.blood_group_type = blood_group_type;
		this.name = name;
	}

	public String get_id() {
		return _id;
	}

	public String getBlood_group_type() {
		return blood_group_type;
	}

	public void setBlood_group_type(String blood_group_type) {
		this.blood_group_type = blood_group_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}