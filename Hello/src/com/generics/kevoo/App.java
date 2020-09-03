package com.generics.kevoo;

class Data{
	private Object object;

	public Data(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	@Override
	public String toString() {
		return "Data [object=" + object + "]";
	}
}

class Generic<T>{
	private T obj;
	public Generic(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Generic [obj=" + obj + "]";
	}
	
}
public class App {

	public static void main(String[] args) {
		// here is a case with normal class
		Data data = new Data("Sting here");
		String variable = (String)data.getObject();
		System.out.println(variable);
		Generic<String> myData = new Generic<String>("Charity");
		String name=myData.getObj();
		System.out.println(name);
		
	}

}
