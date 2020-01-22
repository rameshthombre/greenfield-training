package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		System.out.println("Before sorting  : "+colours);
		
		Collections.sort(colours);
		System.out.println("After sorting  : "+colours);
}
}
