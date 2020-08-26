package com.educative.Default;

public interface InterfaceA {
	//void cleanVehicle();
	default void startVehicle() {
		System.out.print("called from interface B");
	}
}
