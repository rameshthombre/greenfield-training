package java_assignment;

import java.util.HashSet;
import java.util.Set;

public class CloneHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		System.out.println("Original hashset : " +fruits);
		
		Set<String> f = new HashSet<>();
		f = (HashSet) fruits.clone();
		System.out.println("Cloned HashSet :"+fruits);
	}
}
