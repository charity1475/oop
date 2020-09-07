package com.generics.kevoo;
import java.util.Map;
import java.util.TreeMap;
/*since TreeMaps deal with ordering then we must 
 * implement an interface to sort in our 
 * custom class*/
class Code implements Comparable<Code>{
	private String lectureNo;
	private String sectionNo;
	public Code(String lectureNo, String sectionNo) {
		this.lectureNo = lectureNo;
		this.sectionNo = sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	@Override
	public String toString() {
		return "[" + lectureNo + " " + sectionNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1=lectureNo.concat(sectionNo);
		String code2=o.getLectureNo().concat(o.getSectionNo());
		return code1.compareTo(code2);
	}
	
}

public class TreeMaps {

	public static void main(String[] args) {
		Map<Code, String> lecture = new TreeMap<>();
		TreeMaps tree = new TreeMaps();
		tree.addElement(lecture);
		tree.display(lecture);
		
	}
	public Map<Code, String> addElement(Map<Code, String> lecture){
		lecture.put(new Code("01","CS102"), "Charity");
		lecture.put(new Code("02","CP103"), "Ally");
		lecture.put(new Code("03","SE"), "Samason");
		lecture.put(new Code("04","IT102"), "Hamisa");
		lecture.put(new Code("02","CP1034"), "Ally");
		return lecture;
	}
	public void display(Map<Code, String> lecture) {
		for(Map.Entry<Code, String> element: lecture.entrySet()) {
			System.out.println("  ... 	SH256	...	");
			System.out.println(element.getKey().hashCode());
			System.out.println(element.getKey()+" "+" Lecture "+element.getValue());
		}
	}

}
