package java_assignment;
import java.util.ArrayList;

public class CopyArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<>();
		colours.add("yellow");
		colours.add("red");
		colours.add("green");
		colours.add("blue");
		
		//copies arraylist into another list
		ArrayList<String> c = new ArrayList<>(colours);
		System.out.println(c);
	}

}
