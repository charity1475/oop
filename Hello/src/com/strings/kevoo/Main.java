package com.strings.kevoo;

public class Main {

	public static void main(String[] args) {
		String x  ="Study";
		String y ="Easy";
		String z = x.concat(y);
		//System.out.println(z);
		// a wrong way to compare strings
		if(z=="StudyEasy") {
			System.out.println("z==\"StudyEasy\"");
		}else {
			System.out.println("z!=\"StudyEasy\"");
		}
		if(z.equals("StudyEasy")) {
			System.out.println("z Equals \"StudyEasy\"");
		}else {
			System.out.println("z not equals \"StudyEasy\"");
		}

	}

}
