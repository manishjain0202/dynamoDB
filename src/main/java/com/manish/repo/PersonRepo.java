package com.manish.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.manish.entity.Person;

@Repository
public class PersonRepo {

	@Autowired
	private DynamoDBMapper mapper;
	
	public Person addPerson(Person person)
	{
		mapper.save(person);
		return person;
	}

	public Person findPersonByPersonId(String personId)
	{
		return mapper.load(Person.class,personId);
	 
	}
}
