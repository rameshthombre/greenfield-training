package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		
		ArrayList<String> c = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		boolean isEqual = colours.equals(c); // false
		System.out.println(isEqual);
		
	}
}
