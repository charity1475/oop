package com.enums.kevoo;

public class Demo {

	public static void main(String[] args) {
		//object of an enumerated type
		Enum demo = Enum.JSPANDSERVLETS;
		switch (demo) {
		case COLLECTIONS:
			System.out.println("Step 2 learn Collection framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 learn core Java");
			break;
		case GENERICS:
			System.out.println("Step 3 learn Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4 learn JSP and Servlets");
			break;
		case MULTITHREADING:
			System.out.println("Step 5 learn Multithreading");
			break;
		default:
			System.out.println("Exited with no choice");
			break;
			
		}

	}

}
