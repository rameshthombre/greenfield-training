package java_assignment;

import java.util.ArrayList;

public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("green");
		colours.add("yellow");
		colours.add("red");
		colours.add("blue");
		
		//remove an element from the array
		if(colours.contains("red")) 
		{
			System.out.println("color is present");
		}else
		{
			System.out.println("colour is not present");
		}
		
	}
}
