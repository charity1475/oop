package com.exception.kevoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	public static void method() throws FileNotFoundException {
		System.out.println("Hello, I'm the method");
			FileReader reader = new FileReader("file.txt");
			throw new FileNotFoundException();
		
	}

}
