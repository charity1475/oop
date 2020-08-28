package com.anonymousinner.kevoo;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.getLock().test();
		if (door.getLock().isLocked("qwert")) {
			System.out.println("The door has been unlocked");
		}
		else {
			System.out.println("Can't unlock,try a different key");
		}

	}

}
