package com.anonymousinner.kevoo;

/*an abstract class */
abstract class Lock{
	abstract boolean isLocked(String keyCode);
	public void test() {
		System.out.println("testing your key");
	}
}
public class Door {
	/*Anonymous inner class*/
	Lock lock = new Lock() {
		
		@Override
		boolean isLocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			}else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}

}
