package com.oop.kevoo;

public class Jelly extends Fish{
	public String shell;

	public Jelly(float height, double weight, String animalType, String bloodType, String liveIn, String gills,
			String shell) {
		super(height, weight, animalType, bloodType, liveIn, gills);
		this.shell = shell;
	}

	@Override
	public void unique() {
		System.out.println(shell);
	}
	
	
}
