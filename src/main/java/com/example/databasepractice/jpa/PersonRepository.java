package com.example.databasepractice.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person insert(Person p) {
		return entityManager.merge(p);
	}
	
	public Person update(Person p) {
		return entityManager.merge(p);
	}
	
	public void deleteById(int id) {
		Person person = this.findById(id);
		this.entityManager.remove(person);
	}
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery = this.entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

}
