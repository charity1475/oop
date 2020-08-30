package com.staticelement.kevoo;

public class Outer {
	private static int number = 4;
	/*inner class with every thing static*/
	public static class Inner{
		/*inner static method can't be private
		 * static methods can't access non static variables*/
		public static void innerMethod() {
			System.out.println("Testing inner method");
			System.out.println(number);
		
		}
	}

}
