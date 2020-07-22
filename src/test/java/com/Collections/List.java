package com.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {
	public static void main(String[] args) {
		ArrayList<String> li= new ArrayList<String>();
	/*	li.add("Guru");
		li.add("1");
		li.add(0, "Bhargavi");
		System.out.println(li.get(0));
		li.remove(2);
		for (String data : li) {
			System.out.println(data);
			
		}
		*/
		li.add("Subba Reddy");
		li.add(1, "Praney");
		li.add("Supraja");
		li.add(2, "Jahnavi");
		
		ListIterator<String> itr= li.listIterator();
		
		while (itr.hasNext()) {
			
			System.out.println("Index of Element :"+itr.nextIndex()+"    "+"Element Name :"+itr.next());
			
		}
		System.out.println();
	}

}
