package com.heidichen.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
        System.out.println("Test started");

        Developer dev1 = new Developer();

        dev1.displayStatus();

        Developer dev2 = new Developer("Pepper");
        dev2.displayStatus();
        
        dev1.debug();
        
        JuniorDeveloper junDev1 = new JuniorDeveloper();
        junDev1.displayStatus();
        junDev1.pushingWrongUpdate();
        junDev1.displayStatus();
        
        SeniorDeveloper seniorDev = new SeniorDeveloper();
        seniorDev.yellAtOthers(junDev1);
        seniorDev.displayStatus();
        junDev1.displayStatus();

	}

}
