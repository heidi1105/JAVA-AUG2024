package com.heidichen.inheritancedemo;

public class JuniorDeveloper extends Developer{
	// 1. attributes (Attribute that is specifically for Junior developer)
	private boolean inInternship;
	
	// 2. constructors
	public JuniorDeveloper() {
		super("An anonymous junior dev", 8); // calling the third constructor that takes in a name & happiness
		this.inInternship = true;
	}
	
	public JuniorDeveloper(String name) {
		super(name); // calling the second constructor that takes in a name
		this.inInternship = false;
	}


	// 3. getters/setters
	public boolean getInInternship() {
		return inInternship;
	}
	
	public void setInInternship(boolean inInternship) {
		this.inInternship = inInternship;
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Intern: " + this.inInternship);
	}
	
	public void pushingWrongUpdate() {
		// this.happiness -= 100;
		this.setHappiness(this.getHappiness() - 100); // -= 100
		System.out.println("Pushing the wrong update..." + this.getName()+ " is in trouble....");
	}
		
	
}
