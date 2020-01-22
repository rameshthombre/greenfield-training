package java_assignment;

import java.util.ArrayList;

public class RetireveElementAtSpecifiedPosition {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("green");
		colours.add("yellow");
		colours.add("red");
		colours.add("blue");
		
		//displays an element at specified index
		System.out.println("entire collection is : "+colours.get(2));
	}
}
