package Polymorphism;

public class Phone {
	public String Model;

	public Phone(String model) {
		super();
		Model = model;
	}

	public String getModel() {
		return Model;
	}
	public void features() {
		System.out.println("Model "+Model);
	}
	public int sales() {
		int sale = 90;
		return sale;
	}
	
}
