package com.example.databasepractice.springjdbc;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasepracticeApplication implements CommandLineRunner{

	@Autowired
	private PersonDAO person;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabasepracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("find ALL person ->" + person.findAll());
		System.out.println("findById :: 2 ->" + person.findById(2));
		System.out.println("delete id :: 2 ->" + person.deleteById(2));
		System.out.println("update id :: 3 ->" + person.updateById(3, "Sohail"));
		Person p = new Person(4, "Asfaque", "Kalyan", LocalDate.of(1995, 5, 12));
		System.out.println("insert -> "+ person.insertById(p));
		
	}

}
