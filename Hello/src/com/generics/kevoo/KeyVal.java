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
	
	
}
public class KeyVal {

	public static void main(String[] args) {
		MyData<Integer, String> student = new MyData<Integer,String>(205, "Charity");
		System.out.println(student);
		System.out.println(student.getKeyK()+ ":" +student.getValueV());
	}

}
