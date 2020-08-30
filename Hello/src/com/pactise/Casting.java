package com.pactise;
import java.util.Scanner;
import java.lang.Math;
public class Casting {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int True = 3;
		int False = 4;
		int a;float b; double answ;
		System.out.print("Enter the value of a ");
		a =stdin.nextInt();
		System.out.print("Enter the value of b ");
		b =stdin.nextFloat();
		answ = (int)Math.pow((a+b),2);
		System.out.print("(a+b)^2 = " + answ + "\n");
		System.out.println(True);
		System.out.println(False);
	}

}
