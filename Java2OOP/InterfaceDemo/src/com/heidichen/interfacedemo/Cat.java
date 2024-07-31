package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable{
	public Cat() {
		super("Cat");
	}
	
	public Cat(String name) {
		super("Cat", name);
	}
	
	public void showAffection() {
		System.out.println("It's biting you.... showing affection");
	}
	
	public void begForFood() {
		System.out.println("It's meowing... for food at midnight");
	}
}
