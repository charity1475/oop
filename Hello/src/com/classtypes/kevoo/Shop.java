package com.classtypes.kevoo;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if(door.isLocked(args)) {
			System.out.println("The shop is closed ");
		}
		else {
			System.out.println("Welcome, the shop is open ");
		}
		
		/* using anonymous object new Door in case used only once
		if(new Door().isLocked(args)) {
			System.out.println("The shop is closed ");
		}
		else {
			System.out.println("Welcome, the shop is open ");
		}
		*/

	}

}
