package com.exception.kevoo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main{

	public static void main(String[] args){
		try {
			method();
		}catch (FileNotFoundException e) {
			System.out.println("File not found Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	// child class can not handle a parent exception
	public static void method() throws Exception,FileNotFoundException {
		System.out.println("Hello, I'm the method");
			FileReader reader = new FileReader("file.txt");
			switch (2) {
			case 1: 
				throw new FileNotFoundException();
						
			default:
				throw new Exception();
			}

			//nothing executed after returning an exception
		
	}

}
