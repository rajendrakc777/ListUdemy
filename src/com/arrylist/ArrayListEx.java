package com.arrylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {
	//use of arraylist 
	//for random accesss
	//arraylist is bad for insertion and deletion in between

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "orange", "grape" };
		List<String> list = List.of(fruits);
		System.out.println("Fruits list are = " + list);

		List<String> groceries = new ArrayList<>(list);
		groceries.add("eggs");
		System.out.println(groceries);

		List<String> nextGroceries = new ArrayList<>(List.of("pickels", "lettuce", "tomatoes"));
		System.out.println(nextGroceries);

		// add all elements of nextGroceries to groceries to the list
		groceries.addAll(nextGroceries);
		System.out.println(groceries);
		
		//getting the index elements 
		System.out.println("Third item is :" + groceries.get(2));
		
		//allow duplicate value in the arraylist
		groceries.add("apple");
		System.out.println(groceries);
		
		//sorting in arraylist using comparator
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);
		
		//for fixed size of arrylist use Arrays.asList
		List<String> daysOfList = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday");
		System.out.println("List of Fixed size of Array List of Days :" + daysOfList);
		

	}

}
