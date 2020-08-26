package com.interfaces.kevoo;

public class Devices {

	public static void main(String[] args) {
		Phone one = new Nokia();
		System.out.println(one.processor());
		System.out.println(one.os());
		System.out.println(one.space());

	}

}
