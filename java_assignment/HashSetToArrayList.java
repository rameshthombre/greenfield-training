package java_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList 
{
	public static void main(String[] args) 
	{
		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		System.out.println("Original HashSet : " +fruits);
		
		List<String> array = new ArrayList<>(fruits);
		System.out.println("ArrayList :"+array);
	}
}
