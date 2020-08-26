package com.educative.Lambda;

public class Wish {
	/*this implements both*/
	public static void wishing(Greeting greeting) {
		greeting.greet();
		//calls anonymous function  
	}
	public static void main(String[] args) {
		Greeting hindu = new HindiGreeting();
		Greeting briton = new EnglishGreeting();
		/*passing an object as an argument to function*/
		wishing(hindu);
		wishing(briton);

	}

}
