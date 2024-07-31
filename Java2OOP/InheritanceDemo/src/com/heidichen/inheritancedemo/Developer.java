package com.heidichen.inheritancedemo;

import java.util.ArrayList;

public class Developer {

    private String name;
    private ArrayList<String> skills;
    private int happiness;
    private boolean hasLife;
    
    
    public Developer(){
        this.name = "Anonymous hacker";
        this.skills = new ArrayList<String>();
        this.skills.add("Code");
        this.happiness = 5;
        this.hasLife = true;
    }

    public Developer(String name){
        this.name = name;
        this.skills = new ArrayList<String>();
        this.skills.add("Debug");
        this.skills.add("Drinking coffee while typing");
        this.happiness = 7;
        this.hasLife = false;
    }

	public Developer(String name, int happiness) {
		this.name = name;
		this.happiness = happiness;
		this.skills = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public boolean isHasLife() {
		return hasLife;
	}

	public void setHasLife(boolean hasLife) {
		this.hasLife = hasLife;
	}
	
    public void displayStatus(){
        System.out.println("===============");
        System.out.println("Name: " + this.name);
        System.out.println("Skills: " + this.skills);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Has life?: " + this.hasLife);
    }
	
    public void havingErrors(){
        this.happiness--;
        System.out.println(this.name + " is having some bugs... Not fun");
    }

    public void debug(){
        this.happiness+= 2;
        System.out.println(this.name + " is able to fix the bug!!! ");
    }
	
    
    
}
