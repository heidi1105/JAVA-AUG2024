package com.heidichen.firstspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // only for raw data, but not website
//1. Add this annotation to specify this file can render routes
@RequestMapping("/api")
public class APIController {

	// 2. Add the RequestMapping annotation and the corresponding method
	@RequestMapping("/hello") // 2.1 when it reaches localhost:8080/hello
	public String helloWorld() { // 2.2 Display the return of this method
		return "Hello Spring!";
	}
	
	
	// 3 options in routes
	@RequestMapping("/option1") // default of GET
	public String requestOption1() {
		return "RequestMapping: option 1";
	}
	
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String requestOption2() {
		return "RequestMapping: option 2 (long handed)";
	}
	
	@GetMapping("/option3")
	public String requestOption3() {
		return "RequestMapping: option 3(GetMapping, more commonly used these days";
	}
	
	
	// localhost:8080/search?festival=ghostfestival
	@GetMapping("/search")
	public String festivalSubmission(@RequestParam("festival") String fest) {
		return "You searched for " + fest;
	}
	
	// localhost:8080/pet?name=pepper&age=14
	@GetMapping("/pet")
	public String petResult(
			@RequestParam(value="name", required=false) String nameInMethod,
			@RequestParam(value="age", required=false) Integer ageInMethod) {
		if(nameInMethod == null) {
			return "A random cat is here";
		}
		if(ageInMethod == null) {
			return "We don't know the age of " + nameInMethod;
		}
		
		return "Name: "+ nameInMethod + " | Age: " + ageInMethod;
	}
	
	// localhost:8080/activity/karaoke
	@GetMapping("/activity/{whatever}")
	public String activityPath(@PathVariable("whatever") String todo) {
		return "Activity: "+ todo;
	}
	
	
	
}
