package com.example.databasepractice.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person p = new Person();
			p.setId(rs.getInt("id"));
			p.setUsername(rs.getString("username"));
			p.setLocation(rs.getString("location"));
			p.setBirthDate(rs.getDate("birth_date").toLocalDate());
			return p;
		}
		
	}
	
	public List<Person> findAll(){
		return this.jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id){
		return this.jdbcTemplate.queryForObject("select * from person where id=?", 
				new PersonRowMapper(), new Object[] {id});
	}
	
	public int deleteById(int id){
		return this.jdbcTemplate.update("delete from person where id=?", new Object[] {id});
	}
	
	public int insertById(Person person){
		return this.jdbcTemplate.update("insert into person(id, username, location, birth_date) "
				+ "values (?,?,?,?)", new Object[] {person.getId(), person.getUsername(), person.getLocation(), person.getBirthDate()});
	}
	
	public int updateById(int id, String name){
		return this.jdbcTemplate.update("update person set username=? where id=?", new Object[] {name, id});
	}

}
