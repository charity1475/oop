package com.generics.kevoo;


class MyData<K,V>{
	private K keyK;
	private V valueV;
	public MyData(K keyK, V valueV) {
		this.keyK = keyK;
		this.valueV = valueV;
	}
	public K getKeyK() {
		return keyK;
	}
	public V getValueV() {
		return valueV;
	}
	@Override
	public String toString() {
		return "Data [" + keyK + ":" + valueV + "]";
	}
	// having a generic method 
		public <E,N> void display(E element, N number) {
			System.out.println("Element: "+ element+":"+ number);
		}
	
	
}
public class KeyVal {

	public static void main(String[] args) {
		MyData<Integer, String> student = new MyData<Integer,String>(205, "Charity");
		System.out.println(student);
		System.out.println(student.getKeyK()+ ":" +student.getValueV());
		// from a generic method
		System.out.println("From a method --------->");
		student.display(student.getKeyK(), student.getValueV());
		
	}
	
	
}
