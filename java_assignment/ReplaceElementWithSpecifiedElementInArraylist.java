package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElementWithSpecifiedElementInArraylist 
{
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>(4);
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		System.out.println("Original list : " + colours);
		colours.set(1, "black");
		System.out.println("Modified list : " + colours);
	}
}
