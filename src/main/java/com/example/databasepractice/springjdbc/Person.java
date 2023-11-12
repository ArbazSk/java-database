package com.example.databasepractice.springjdbc;

import java.time.LocalDate;

public class Person {
	
	private int id;
	private String username;
	private String location;
	private LocalDate birthDate;
	
	public Person(){};
	
	public Person(int id, String username, String location, LocalDate birthDate) {
		super();
		this.id = id;
		this.username = username;
		this.location = location;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", username=" + username + ", location=" + location + ", birthDate=" + birthDate
				+ "]";
	}
	
	

}
