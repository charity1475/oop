package com.interfaces.kevoo;

public class Nokia implements Phone{

	@Override
	public String processor() {
		return "core i 5";
	}

	@Override
	public String os() {
		return "Os X";
	}

	@Override
	public int space() {
		return 500;
	}
	

}
