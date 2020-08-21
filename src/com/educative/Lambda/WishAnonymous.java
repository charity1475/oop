package com.educative.Lambda;

public class WishAnonymous {
	public static void wishing(Greeting greeting) {
		greeting.greet();
		//calls anonymous function  
	}
	public static void main(String[] args) {
		/*implementing it by lambda instead of passing an 
		 * object of a class and method name 
		 * since it is an abstract method we just give the body */
		wishing(()-> {
				System.out.println("Hero India");
			}
		);
	}
}
