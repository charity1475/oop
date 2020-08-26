package com.educative.Default;
/* interfaces is a solution to multiple inheritance*/
public class Main implements InterfaceA, InterfaceB{

	@Override
	public void startVehicle() {
		// Here is how to resolve diamond problem.
		InterfaceA.super.startVehicle();
		InterfaceB.super.startVehicle();
	}
	public static void main(String[] args) {
		Main mainm = new Main();
		mainm.startVehicle();
	}
}
