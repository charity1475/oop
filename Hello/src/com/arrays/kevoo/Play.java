package com.arrays.kevoo;

import java.util.ArrayList;
class IntegerWrapper{
	public int num;

	public IntegerWrapper(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}


public class Play {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		for(int i =0;i<6;++i) {
			numbers[i]=i+1;
		}
		/*
		ArrayList<Integer> list = new ArrayList<>();
		//auto-boxing when we use default class integer is converted to object
		 *  this is a background operation list.add(new Double.valueOf(10.2));
		 *  also for un-boxing list.get(0).doubleValue(); 
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(200);
		for(int one: list) {
			System.out.println(one);
		}
		int at = list.indexOf(200);
		System.out.println("200 is at "+at);
		*/
		ArrayList<IntegerWrapper> list = new ArrayList<>();
		//boxing-primitive data in to an object
		list.add(new IntegerWrapper(200));
		list.add(new IntegerWrapper(300));
		list.add(new IntegerWrapper(400));
		System.out.println(list.get(1).getNum());
	
	
	}

}
