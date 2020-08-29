package com.exception.kevoo;

public class App {

	public static void main(String[] args) {
		case1(8,0);
		case2(8,2);

	}
	public static void case1(int x, int y) {
		try {
			System.out.println("case1: x/y = " + x/y);
		} catch (Exception e) {
			System.out.println("Zero Division error");
		}
		
	}
	public static void case2(int x, int y) {
		System.out.println("case2: x-y = " + (x-y));
	}

}
