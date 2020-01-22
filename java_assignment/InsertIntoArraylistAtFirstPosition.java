package java_assignment;

import java.util.ArrayList;

public class InsertIntoArraylistAtFirstPosition {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("green");
		colours.add("yellow");
		colours.add("red");
		colours.add("blue");
		
		//inserts at first position
		colours.add(0, "gray");
		
		System.out.println("entire collection is : "+colours);
	}

}
