package com.oop.kevoo.shop;

public class Door {
	public Lock lock;
	/*Door constructor */
	public Door() {
		lock = new Lock(true);
	}
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("The shop is now closed");
		}
		else {
			System.out.println("The shop is open Welcome");
		}
	}
	

	public Lock getLock() {
		return lock;
	}


	public class Lock{
		private boolean lock;
		/*constructor for nested class*/
		public Lock(boolean lock) {
			this.lock = lock;
		}
		/*Getters and setters*/
		public boolean isLock() {
			return lock;
		}
		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}

}
