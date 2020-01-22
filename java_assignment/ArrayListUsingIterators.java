package java_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterators {

	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("green");
		colours.add("yellow");
		colours.add("red");
		colours.add("blue");
		
		Iterator<String> itr = colours.iterator();
		System.out.println("ArrayList after iteration ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
