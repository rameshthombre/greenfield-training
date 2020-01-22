package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		System.out.println("List before shuffle : " + colours);
		Collections.reverse(colours);
		System.out.println("List after shuffle : " + colours);
	}
}
