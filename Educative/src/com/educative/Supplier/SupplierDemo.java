package com.educative.Supplier;
import java.util.function.Supplier;

import com.educative.Interface.Person;

import java.util.function.Predicate;

public class SupplierDemo {
	static boolean isEligible(Supplier<Person> supplier,Predicate<Person> predicate) {
		return predicate.test(supplier.get());
	}

	public static void main(String[] args, Supplier<Person> supplier, Predicate<Person> predicate) {
		//Person person = new Person("Ally", 20);
		boolean eligible = isEligible(supplier, predicate);
		System.out.println(eligible);

	}

}
