package com.educative.Interface;

import java.util.function.BiPredicate;

public class Bipredicate {
	static boolean isEligible(Person person,Integer minAge,BiPredicate<Person, Integer> predicate) {
		return predicate.test(person, minAge);
	}
	public static void main(String[] args) {
		Person person = new Person("Catherine", 24);
		boolean eligilbe = isEligible(person, 18, 
				(p,minAge)-> {return p.age>minAge;});
		System.out.println("Person is elible to vote: " + eligilbe);

	}

}
