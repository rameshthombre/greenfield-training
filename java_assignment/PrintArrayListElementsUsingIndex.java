package java_assignment;

import java.util.ArrayList;

public class PrintArrayListElementsUsingIndex {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>(4);
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		int size = colours.size();
		for(int i=0; i< size;i++)
		{
			System.out.println(i +" -----> "+colours.get(i));
		}
	}
}
