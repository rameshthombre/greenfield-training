package java_assignment;

import java.util.ArrayList;

public class UpdateArrayListElement {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("green");
		colours.add("yellow");
		colours.add("red");
		colours.add("blue");
		
		colours.set(3, "black");
		//replaces blue with black
		System.out.println("collection after update is : "+colours);
	}
}
