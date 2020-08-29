package com.staticelement.kevoo;

public class ClassB extends ClassA {
	//use final for values that won't change
	private final int x ;
	public ClassB() {
		this.x = 5;
	}

	public int getX() {
		return x;
	}
	
}
