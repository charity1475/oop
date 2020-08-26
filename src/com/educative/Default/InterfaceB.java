package com.educative.Default;

public interface InterfaceB {
	//void cleanVehicle();
	default void startVehicle() {
		System.out.println("Started a car from B");
	}

}
