package java_assignment;

import java.util.HashSet;
import java.util.Set;

public class CheckEmptyHashSet 
{
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		
		System.out.println("Checking if HashSet is empty or not :"+fruits.isEmpty());
	}
}
