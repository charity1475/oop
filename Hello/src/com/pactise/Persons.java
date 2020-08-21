package com.pactise;

public class Persons {
	private String name;
	private int age;
	private String gender;
	// this is a default constructor
	public Persons() {
		this.setName("Charity");
		this.setAge(20);
		this.setGender("Male");
	}
	// here  i overload the constructor 
	
	public Persons(String name, int age, String gender) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
