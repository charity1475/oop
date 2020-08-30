package com.oop.kevoo;

public class Vehicles {
	private String name;
	private int wheels;
	private String type;
	public Vehicles(String name, int wheels, String type) {
		super();
		this.name = name;
		this.wheels = wheels;
		this.type = type;
	}
	public void introduce() {
		System.out.print("The vehicle is " + name);
		System.out.print(", It has "+wheels+" Wheels ");
		System.out.println("The "+name+" travels on the "+ type );
	}
	public void motion() {
		System.out.println("A " + name + " locomotes");
	}
}
