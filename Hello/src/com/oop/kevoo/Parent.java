package com.oop.kevoo;

public class Parent {
	public String name;
	public int age;
	public String gender;
	public Parent() {
		this.name = "Parent";
		this.age = 45;
		this.gender = "Male";
	}
	// using a default constructor
	public void show() {
		System.out.println("Status: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}

}
