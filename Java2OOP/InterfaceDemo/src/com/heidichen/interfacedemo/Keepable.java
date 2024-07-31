package com.heidichen.interfacedemo;

public interface Keepable {

	// default -- complete methods that all implemented class can use
	public default void play() {
		System.out.println("Playing....");
	}
	
	// abstract method -- incomplete and the implemented class must complete it
	public abstract void showAffection();
	public abstract void begForFood();
}
