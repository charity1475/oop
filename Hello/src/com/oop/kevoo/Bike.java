package com.oop.kevoo;

public class Bike extends Vehicles{
	String sterling;
	
	public Bike(String name, int wheels, String type, String sterling) {
		super(name, wheels, type);
		this.sterling = sterling;
	}

	@Override
	public void motion() {
		System.out.print("The bicycle is being peddled ");
		System.out.println(" it has a "+sterling+" Sterling");
	}
	
}
