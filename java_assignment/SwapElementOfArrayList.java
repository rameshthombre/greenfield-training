package java_assignment;

import java.util.ArrayList;

public class SwapElementOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		System.out.println("List before join : " + colours);
		
		ArrayList<String> colours2 = new ArrayList<>();
		colours.add("blue");
		colours.add("black");
		colours.add("purple");
		colours2.addAll(colours);
		System.out.println("List after join : " + colours2);
		
	}

}
