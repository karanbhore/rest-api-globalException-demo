package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.entity.Person;
import com.prowings.service.VoterService;

@RestController
public class PersonController {

	@Autowired
	VoterService voterService;
	
	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return "Welcome to Spring-mvc rest!!";
	}
	
	@PostMapping("/vote")
	public ResponseEntity<String> doVote(@RequestBody Person person) {
		String result=voterService.doVote(person);
		ResponseEntity<String> response= new ResponseEntity<String>(result, HttpStatus.OK);
		return response;
		
		
		
	}
	
	
	
	
}
