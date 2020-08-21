package Polymorphism;

public class Nokia extends Phone{

	public Nokia(String model) {
		super(model);
	}
	@Override
	public void features() {
		System.out.println("Model "+Model);
	}
	
}
