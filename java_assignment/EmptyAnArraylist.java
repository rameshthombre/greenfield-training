package java_assignment;
import java.util.ArrayList;

public class EmptyAnArraylist
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		System.out.println("Original list : " + colours);
		colours.removeAll(colours);
		System.out.println("empty list :"+colours);
	}
}
