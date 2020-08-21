package com.pactise;

public class Car {
	private String name;
	private double price;
	/* Generating a constructor to access them globally*/
	
	public Car() {
		this.name = "NMZ";
		this.price = 500;
	}
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void introduce() {
		System.out.print("The car name is " + name + " and the price is "+ price);
	}
	
	
}
