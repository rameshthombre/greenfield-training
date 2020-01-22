package java_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
	public static void main(String[] args) 
	{
		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		System.out.println("HashSet : " +fruits);
		
		String[] array = new String[fruits.size()];
		
		fruits.toArray(array);
		System.out.println("Array Elements are : ");
		for(String str : array)
		{
			System.out.println(str);
		}
	}
}
