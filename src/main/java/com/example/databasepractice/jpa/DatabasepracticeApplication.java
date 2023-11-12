package com.example.databasepractice.jpa;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasepracticeApplication implements CommandLineRunner{

	@Autowired
	private PersonRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabasepracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("findById :: 2 ->" + repository.findById(2));
		System.out.println("insert -> " + repository.insert(new Person("Makr", "LA", LocalDate.of(1992, 3, 5))));
		System.out.println("update -> " + repository.insert(new Person(13,"patcummin", "Australia", LocalDate.of(1992, 3, 5))));
		this.repository.deleteById(1);
		System.out.println("Find All -> " + this.repository.findAll());
		/*
		 * System.out.println("find ALL person ->" + repository.findAll());
		 * System.out.println("delete id :: 2 ->" + repository.deleteById(2));
		 * System.out.println("update id :: 3 ->" + repository.updateById(3, "Sohail"));
		 * Person p = new Person(4, "Asfaque", "Kalyan", LocalDate.of(1995, 5, 12));
		 * System.out.println("insert -> "+ repository.insertById(p));
		 */		
	}

}
