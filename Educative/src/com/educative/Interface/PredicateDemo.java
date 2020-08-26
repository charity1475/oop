package com.educative.Interface;

import java.util.function.Predicate;

public class PredicateDemo {
	/*method takes person object and predicate as parameters 
	 * */
	static boolean isPersonEligible(Person person, Predicate<Person> predicate) {
		return predicate.test(person);
	}
	static boolean isAgeLessTen(Person person, Predicate<Person> predicate) {
		return predicate.negate().test(person);
	}
	public static void main(String[] args) {
		Person person = new Person("Charity", 20);
		/* Created a predicate. It returns true if 
		 * age is greater than 18.*/
		Predicate<Person> predicate = (p)-> p.age>18;
		boolean eligibleAge = PredicateDemo.isPersonEligible(person, predicate);
		System.out.println("Person is eligible for voting: "+ eligibleAge);
		Predicate<Person> job = (p)-> p.age<25;
		boolean eligibleJob = PredicateDemo.isPersonEligible(person, job);
		System.out.println("He is below 25: " +eligibleJob);
		// shortcut of predicate and job
		Predicate<Person> people = predicate.and(job);
		boolean both = PredicateDemo.isPersonEligible(person, people);
		System.out.println("He is > 18 and <25: "+both);
		Predicate<Person> one = predicate.or(job);
		boolean forOne = PredicateDemo.isPersonEligible(person, one);
		System.out.println("He is either >18 or <25: " +forOne);
		Predicate<Person> lessTen = (p)->p.age>=10;
		boolean negation = PredicateDemo.isAgeLessTen(person, lessTen);
		System.out.println("Age is less 10: "+ negation);
		/*comparing two predicates */
		Predicate<String> compare = Predicate.isEqual("Charity");
		boolean sameName = compare.test("Daniel");
		System.out.println("Has the same name: "+sameName);
		
	}
}
