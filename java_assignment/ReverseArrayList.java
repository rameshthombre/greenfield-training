package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		System.out.println("List before reverse : " + colours);
		Collections.reverse(colours);
		System.out.println("List after reverse : " + colours);
	}
}
