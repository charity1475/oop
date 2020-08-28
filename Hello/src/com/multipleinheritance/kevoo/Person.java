package com.multipleinheritance.kevoo;

public class Person implements LiveLife,IsAlive{
	
	@Override
	public void breathe() {
		System.out.println("Took a long breathe ");
	}

	@Override
	public void message() {
		System.out.println("Meet me at the top");
	}


}
