package com.interfaces.kevoo;

public class Person {
	public static void main(String[] args) {
		Vegan john = new Vegan() {
			
			@Override
			void speak() {
				System.out.println("John speak Vegan languages");
			}
		};
		john.eat();
		john.speak();
	}

}
