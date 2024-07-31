package com.heidichen.interfacedemo;

public class Pet {

	private String petType;
	private String name;
	
	public Pet() {
		this.petType = "Unknown pet type";
		this.name = "Anonymous pet";
	}
	
	public Pet(String petType) {
		this.petType = petType;
		this.name = "Anonymous " + petType; 
	}

	public Pet(String petType, String name) {
		this.petType = petType;
		this.name = name;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.petType);
	}

	
	
}
