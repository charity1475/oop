package com.anonymousinner.kevoo;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("What is you name--");
		String name = stdin.nextLine();
		System.out.print("Your age--");
		int age = stdin.nextInt();
		stdin.close();
		System.out.println("Welcome "+ name);
		System.out.println("You aged " + age);

	}

}
