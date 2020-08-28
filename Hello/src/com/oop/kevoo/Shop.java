package com.oop.kevoo;

import com.oop.kevoo.shop.Door;

public class Shop {
	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();
		/*here we directly access a lock setter method via a lock getter*/
		door.getLock().setLock(false);
		door.shopStatus();
	}

}
