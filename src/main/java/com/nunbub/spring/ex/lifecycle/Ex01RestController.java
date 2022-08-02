package com.nunbub.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nunbub.spring.ex.lifecycle.model.Person;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {

	@RequestMapping("/3")
	public String stringResponse() {
		return "RestController 테스트!!";
	}
	
	// 직접 만든 클래스의 객체 return
	@RequestMapping("/4")
	public Person objectResponse() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(26);
		
		return person;
	}
	
	// entity - http status code 포함
	@RequestMapping("/5")
	public ResponseEntity<Person> entityResponse() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(26);
		
		// Status - 200 OK
		// 500 - Internal server error
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
}
