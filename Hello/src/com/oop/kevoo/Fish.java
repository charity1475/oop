package com.oop.kevoo;

public class Fish extends Animal {
	public String liveIn;
	public String gills;
	
	public Fish(float height, double weight, String animalType, String bloodType, String liveIn, String gills) {
		super(height, weight, animalType, bloodType);
		this.liveIn = liveIn;
		this.gills = gills;
	}

	@Override
	public void unique() {
		System.out.println(liveIn);
		System.out.println(gills);
	}
	
}
