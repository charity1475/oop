package com.interfaces.kevoo;

public class Devices {

	public static void main(String[] args) {
		/*object of phone can be of any other type polymophism*/
		Phone one = new Nokia();
		System.out.println(one.processor());
		System.out.println(one.os());
		System.out.println(one.space());

	}

}
