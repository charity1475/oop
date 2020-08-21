package com.oop.kevoo;

public class Bird extends Animal {
	public String fly;
	public Bird(float height, double weight, String animalType, String fly) {
		super(height, weight, animalType, fly);
		this.fly = fly;
	}
	@Override
	public void unique() {
		System.out.println(fly);
	}
	
}
