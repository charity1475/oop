package com.exception.kevoo;

import java.io.FileNotFoundException;
import java.io.FileReader;
class UserDefinedException extends Throwable{
	
}

public class Main extends Exception{

	public static void main(String[] args){
		try {
			method();
		}catch (FileNotFoundException e) {
			System.out.println("File not found Exception");
		} catch (UserDefinedException e) {
			System.out.println("My Exception");
		}catch (Exception e) {
			System.out.println("Exception");
		}
	}
	// child class can not handle a parent exception
	public static void method() throws Exception,FileNotFoundException, UserDefinedException {
		System.out.println("Hello, I'm the method");
			FileReader reader = new FileReader("file.txt");
			switch (2) {
			case 1: 
				throw new FileNotFoundException();
				
			case 2: 
				throw new UserDefinedException();
						
			default:
				throw new Exception();
			}

			//nothing executed after returning an exception
		
	}

}
