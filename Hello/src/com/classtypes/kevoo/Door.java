package com.classtypes.kevoo;

public class Door {
	public boolean isLocked(String[] args) {
		class Lock{
			public boolean isLocked(String[] args) {
				if(args.equals("qwerty")) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return new Lock().isLocked(args);
	}

}
