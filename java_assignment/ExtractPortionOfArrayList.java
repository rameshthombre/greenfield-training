package java_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractPortionOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		colours.add("white");
		colours.add("orange");
		colours.add("black");
		
		System.out.println("entire list :" + colours);
		System.out.println("portion of the list");
		for(int i=0; i < colours.size()-2;i++)
		{
			System.out.print(colours.get(i) + ", ");
		}
		
	}
}
