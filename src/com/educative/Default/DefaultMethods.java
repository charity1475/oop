package com.educative.Default;

public class DefaultMethods implements Vehicle{

	@Override
	public void cleanVehicle() {
		
	}

	public static void main(String[] args) {
		DefaultMethods defaultm = new DefaultMethods();
		defaultm.cleanVehicle();
		defaultm.startVehicle();
	}
}
