package java_assignment;

import java.util.ArrayList;

public class ExtendArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>(4);
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		System.out.println("Before extending arraylist : "+colours);
		colours.ensureCapacity(2);
		colours.add("purple");
		colours.add("white");
		
		System.out.println("after extending arraylist : "+colours);
		
	}
}
