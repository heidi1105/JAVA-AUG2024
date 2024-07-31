package com.heidichen.inheritancedemo;

public class SeniorDeveloper extends Developer {
	// no specific attribute for senior developer
	
	public SeniorDeveloper() {
		super("An anonymous senior dev", 8); // calling the third constructor that takes in a name & happiness
	}
	
	public SeniorDeveloper(String name) {
		super(name); // calling the second constructor that takes in a name
	}
	
	public void yellAtOthers(Developer target) {
		this.setHappiness(this.getHappiness() + 1); // I got happier
		target.setHappiness(target.getHappiness() - 1); // target will be sad
		System.out.println(this.getName() + " is yelling at " + target.getName());
	}
	
}
