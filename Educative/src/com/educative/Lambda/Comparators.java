package com.educative.Lambda;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparators {
		public static List<Person> getPersons(List<Person> persons){
			//anonymous comparator
			Collections.sort(persons, new Comparator<Person>(){

				@Override
				public int compare(Person p1, Person p2) {
					return p1.getName().compareTo(p2.getName());
				}
				
			});
			return persons;
		}

}
