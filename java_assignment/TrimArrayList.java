package java_assignment;

import java.util.ArrayList;

public class TrimArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>(9);
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		colours.trimToSize();
		System.out.println("size after trim operation : "+colours);
		
	}
}
