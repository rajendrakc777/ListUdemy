package com.vector;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//use of Vector data structure
//older implementation
//it is synchronized
//use for multi thread environment
public class VectorEx01 {

	public static void main(String[] args) {
		List<String> myList = new Vector<>();
		myList.add("apple");// Vector are dynamic
		myList.add("banana");//Vector  are ordered
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
