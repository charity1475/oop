package com.educative.Supplier;

import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierTest {
	public static boolean isEligible(
			Supplier<Person> supplier, Predicate<Person> predicate) {
		return predicate.test(supplier.get());
	}
	public static void main(String[] args) {
		Supplier<Person> supplier = ()-> new Person("John", 21);
		Predicate<Person> predicate = (p) -> p.age>18;
		boolean result = isEligible(supplier, predicate);
		System.out.println("The answer is "+result);
		/*more about supplier interface*/
		IntSupplier supplier1 =  ()-> (int)(Math.random()*10);
		System.out.println(supplier1.getAsInt());
		
	}

}
/*class person outside supplier*/
class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
