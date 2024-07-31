package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable{

	public Dog() {
		super("Dog");
	}
	
	public Dog(String name) {
		super("Dog", name);
	}

	@Override
	public void showAffection() {
		System.out.println("Wagging tail... to show affection");
		
	}

	@Override
	public void begForFood() {
		System.out.println("Scratching himself.... Need some food");
		
	}
}
