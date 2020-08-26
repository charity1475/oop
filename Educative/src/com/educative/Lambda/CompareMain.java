package com.educative.Lambda;
import java.util.ArrayList;
import java.util.List;

public class CompareMain {
	public static void main(String[] args) {
		/*adding the person object to the list*/
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Charity", 19,"Tanzania"));
		persons.add(new Person("Daniel", 56,"Tanzania"));
		persons.add(new Person("Catherine", 56,"Kenya"));
		persons.add(new Person("Khehlan",20,"Canada"));
		persons.add(new Person("Anna",34,"Senegal"));
		/*calling the method getPerson() which returns a sorted order */
		List<Person> sortedPersons = Comparators.getPersons(persons);
		for(Person person: sortedPersons) {
			System.out.println("Person name is "+person.getName()+" Aged("+person.getAge()+")");
		}
		System.out.println("Helloooo");
	}
}
