package com.exception.kevoo;

import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		method();
	}
	public static void method() {
		System.out.println("Hello, I'm the method");
		try {
			FileReader reader = new FileReader("file.txt");
			reader.close();
		} catch (Exception e) {
			System.out.println("The file doesn't exist");
		}
	}

}
