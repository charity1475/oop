package com.oop.kevoo;

public class InheritedVehicle {
	public static void main(String[] args) {
		Bike bike = new Bike("Skate-Bicycle", 2, "Land","T-shaped");
		Car car =new Car("Ferrari", 4, "Land","6-Piston");
		car.introduce();
		car.motion();
		bike.introduce();
		bike.motion();
	}
}
