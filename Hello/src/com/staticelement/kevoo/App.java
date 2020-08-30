package com.staticelement.kevoo;

public class App {

	public static void main(String[] args) {
		TestStatic test = new TestStatic();
		System.out.println(test.getStaticVariable());
		test.setStaticVariable(20005);
		System.out.println(test.getStaticVariable());
		TestStatic newtest = new TestStatic();
		System.out.println(newtest.getStaticVariable());
		newtest.setStaticVariable(200);
		System.out.println(newtest.getStaticVariable());
		System.out.println(test.getStaticVariable());
	}

}
