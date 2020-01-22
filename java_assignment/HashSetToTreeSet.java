package java_assignment;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet
{
	public static void main(String[] args) 
	{
		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		System.out.println("HashSet : " +fruits);
		
		TreeSet<String> t = new TreeSet<>(fruits);
		System.out.println("TreeSet :"+t);
	}
}
