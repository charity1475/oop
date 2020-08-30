package Polymorphism;

public class Polymorphic {

	public static void main(String[] args) {
		Phone phone = new Phone("Iphone 6");
		phone.features();
		Nokia nokia = new Nokia("Samsung");
		nokia.features();
		Phone oneNokia = new Nokia("Nokia");
		oneNokia.features();
		System.out.println("Sold at "+oneNokia.sales() + " $");
		Phone edge = new Nokia("Motorola");
		edge.features();
		System.out.println("Sold at "+oneNokia.sales() + " $");
		
	}

}
