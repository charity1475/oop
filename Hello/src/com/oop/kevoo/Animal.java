package com.oop.kevoo;

public class Animal {
	public float height = 2;
	public double weight=10;
	public String animalType;
	public String bloodType;
	public Animal(float height, double weight, String animalType, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	public void showInfo() {
		System.out.println(animalType);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(bloodType);
	}
	public void unique() {
	}
}
