package java_assignment;

import java.util.ArrayList;

public class CheckEmptyArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		System.out.println("Array list empty status : "+colours.isEmpty());
	}
}
