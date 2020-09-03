package com.arrays.kevoo;

import java.util.LinkedList;
import java.util.Stack;

public class Staks {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(35);
		demo.push(36);
		demo.push(37);
		demo.push(38);
		demo.push(39);
		for(int one: demo) {
			System.out.println(one);
		}
		System.out.println("Then here state operations");
		int num = demo.pop();
		System.out.println("Removed "+ num);
		System.out.println(demo.empty());
		System.out.println(demo.isEmpty());
		System.out.println("At the top "+demo.peek());
		System.out.println("Is 35 present? "+demo.search(35));
		for(int one: demo) {
			System.out.println(one);
		}
		
		// dealing with linked lists
		LinkedList<String> countries = new LinkedList<>();
		countries.add("Tanzania");
		countries.add("Uganda");
		countries.add("Rwanda");
		countries.add("Burundi");
		System.out.println(countries);
		countries.add(1,"Kenya");
		System.out.println(countries);
		countries.set(2, "Somali");
		System.out.println(countries);
		countries.remove();
		System.out.println(countries);
		
	}
	

}
