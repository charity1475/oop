package com.educative.Default;

public interface Vehicle {
	/*this has one abstract method and default*/
	void cleanVehicle();
	default void startVehicle() {
		System.out.println("The vehicle has started");
	}
}
