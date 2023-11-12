package com.example.databasepractice.springDataJpa;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String location;
	private LocalDate birthDate;
	
	public Person(){};
	
	public Person(int id, String username, String location, LocalDate birthDate) {
		this(username, location, birthDate);
		this.id = id;
	}
	
	public Person(String username, String location, LocalDate birthDate) {
		super();
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
		return "\nPerson [id=" + id + ", username=" + username 
				+ ", location=" + location + ", birthDate=" + birthDate + "]";
	}
}
