package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		Cat cat2 = new Cat("Pepper");
		
		cat1.displayStatus();
		cat2.displayStatus();
		dog1.displayStatus();
		
		cat1.play();
		cat1.begForFood();
		cat1.showAffection();

		dog1.begForFood();
		dog1.showAffection();
	}

}
