package com.linkedlist;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

//Use LinkedList: When you need to frequently insert or delete elements, 
//especially in the middle of the list, and do not require frequent random access.
public class Main {

	public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("apple");// list are dynamic
		myList.add("banana");// lists are ordered
		myList.add("grapes");// allow duplicates elements in linked list
		myList.add("grapes");// not use of hashcode here in list
		myList.add("grapes");

		System.out.println("------------using of for : each Loop------------");

		// JDK 1.5 introduce for:each :loop
		for (String tempa : myList) {
			System.out.println("my fruits list are: " + tempa);
		}
		System.out.println(myList.get(2));
		System.out.println("---------using of Iterator------------");

		Iterator<String> iterator = myList.iterator();

		while (iterator.hasNext()) {
			String result = iterator.next();
			System.out.println(result);
		}
		
		
		


	}

}
