package com.example.Registaration.entity;

import jakarta.persistence.*;
@Entity
public class registrationEntity {
	
	@Id	
	private int id;
	private String firstName;
	private String MiddleName;
	private String LastName;
	public registrationEntity(int id, String firstName, String middleName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
	}
	public registrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
