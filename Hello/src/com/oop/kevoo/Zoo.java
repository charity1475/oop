package com.oop.kevoo;

public class Zoo {
	public static void main(String[] args) {
		Fish fish = new Fish(1, 2, "Fish", "Warm","water","Use gills");
		Bird bird = new Bird(2, 5, "Bird", "cold");
		Jelly jelly = new Jelly(1, 2, "Jelly", "Warm", "Water", "Use gills", " no shell");
		fish.showInfo();
		fish.unique();
		bird.showInfo();
		bird.unique();
		jelly.showInfo();
		jelly.unique();
		
	}

}
