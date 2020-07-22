package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortClass {
	public static void main(String[] args) {
		ArrayList<student> al= new ArrayList<student>();
		al.add(new student(20, "Guru"));
		al.add(new student(25, "GuruMohan"));
		al.add(new student(30, "Chakri"));
		Collections.sort(al);
		Iterator<student> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().age+" "+itr.next().Name+" "+itr.next().CollegeName);
			
		}
		
		/*for (comparableclass comp : al) {
			System.out.println(comp.age+"  "+comp.Name+"  "+comp.CollegeName);
		}*/
		
		
	}
}
