package com.exception.kevoo;

public class App {

	public static void main(String[] args) {
		case1(0,8);
		case2(8,2);

	}
	public static void case1(int x, int y) {
		try {
			System.out.println("case1: x/y = " + x/y);
		}catch (ArithmeticException e) {
			System.out.println("Arthematic exception occured");
		}catch (Exception e) {
			System.out.println("Zero Division error");
			e.printStackTrace();
		}
		/*finally block will always be executed*/
		try {
			System.out.println("Reversed case1: "+ x/y);
		} finally {
			System.out.println("Finally on air");
		}
	}
	public static void case2(int x, int y) {
		System.out.println("case2: x-y = " + (x-y));
	}

}
