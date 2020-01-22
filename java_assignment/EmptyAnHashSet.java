package java_assignment;

import java.util.HashSet;
import java.util.Set;

public class EmptyAnHashSet {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("custard-apple");
		System.out.println("Original Set : "+ fruits);
		fruits.removeAll(fruits);
		System.out.println("Set After removing all elements : "+fruits);
		
	}
}
