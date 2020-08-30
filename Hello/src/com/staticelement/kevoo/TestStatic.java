package com.staticelement.kevoo;

public class TestStatic {
	/*marking it static then the same memory address is used for 
	 * all objects*/
	private static int staticVariable =3;

	public int getStaticVariable() {
		return staticVariable;
	}

	public void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
	
	
}
