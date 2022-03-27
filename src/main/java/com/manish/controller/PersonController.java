package com.manish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.entity.Person;
import com.manish.repo.PersonRepo;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepo repo;
	
	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return repo.addPerson(person);
	}
	
	@GetMapping("/getPerson/{id}")
	public Person savePerson(@PathVariable(value = "id") String personId) {
		return repo.findPersonByPersonId(personId);
			
		}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Manish!!";
			
		}
	 
	}

 
