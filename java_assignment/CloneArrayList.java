package java_assignment;
import java.util.ArrayList;

public class CloneArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		System.out.println("First arraylist : "+colours);
		ArrayList c = new ArrayList();
		c = (ArrayList) colours.clone();
		System.out.println("cloned arraylist : "+c);
	}
}
