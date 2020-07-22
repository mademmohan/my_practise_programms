package com.Collections;

import java.util.LinkedList;
import java.util.TreeSet;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Guru");
		ll.add("Manju");
		ll.add("Kesava");
		ll.add("Siva Reddy");
		System.out.println(ll.hashCode());
		System.out.println("linked list elements :"+ll);
		
		LinkedList<String>ll2= new LinkedList<String>();
		ll2.add("Jahnavi");
		ll.addAll(ll2);
		
		ll.removeAll(ll);
		System.out.println(ll.size());
		System.out.println("Added data in linked list :"+ll);
		System.out.println(ll.poll());
		ll.removeLast();
		System.out.println("Added data in linked list :"+ll);
		System.out.println(ll.lastIndexOf(ll));
		System.out.println(ll.containsAll(ll2));
		
		TreeSet<String> set= new TreeSet<String>();
		/*set.add("Gururvireddy");
		set.add("Manjula Reddy");
		set.add("Chiranjeevi reddy");*/
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		
		
		
		System.out.println(set.headSet("C"));
		System.out.println(set.tailSet("C", true));
	}

}
