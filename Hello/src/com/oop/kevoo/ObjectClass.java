package com.oop.kevoo;

public class ObjectClass {
	public static void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		System.out.println(smart.getBrand());
		smart.setBrand("Samsung");
		System.out.println(smart.getBrand());
	}
}
