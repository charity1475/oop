package com.generics.kevoo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyMaps {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		MyMaps starter = new MyMaps();
		starter.addElement(map);
		starter.display(map);
		System.out.println("Via second method");
		starter.displayBykey(map);
		System.out.println("Trying from iter");
		starter.displayByIterator(map);

	}
	public Map<Integer, String> addElement(Map<Integer, String> map){
		map.put(570, "Charity");
		map.put(410, "Ally");
		map.put(390, "Samason");
		map.put(240, "Hamisa");
		return map;
	}
	public void display(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> element: map.entrySet()) {
			System.out.println("ID: "+element.getKey()+" Name: "+element.getValue());
		}
	}
	public void displayBykey(Map<Integer, String> map) {
		for(Integer element: map.keySet()) {
			System.out.println("ID: "+element+" Name:"+ map.get(element));
		}
	}
	public void displayByIterator(Map<Integer, String> map) {
		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();
		while (entry.hasNext()) {
			// clearing double call which skips
			Entry<Integer, String> temp = entry.next();
			System.out.println("ID: "+temp.getKey()+" Name: "+temp.getValue());
			
		}
		
	}

}
