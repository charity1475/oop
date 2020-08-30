package com.oop.kevoo;

public class Car extends Vehicles {
	String engine;

	public Car(String name, int wheels, String type, String engine) {
		super(name, wheels, type);
		this.engine = engine;
	}

	@Override
	public void motion() {
		System.out.print("A car Moves on the land, sicne it has ");
		System.out.println(engine);
	}
	

}
