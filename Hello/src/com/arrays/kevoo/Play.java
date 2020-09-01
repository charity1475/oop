package com.arrays.kevoo;

public class Play {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		for(int i =0;i<6;++i) {
			numbers[i]=i+1;
		}
		for(int one: numbers) {
			System.out.println(one);
		}

	}

}
