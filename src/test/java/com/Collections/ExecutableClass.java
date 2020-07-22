package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExecutableClass {
	public static void main(String[] args) {
		ArrayList<student> ar = new ArrayList<student>();
		ar.add(new student(101, "Bhargavi"));
		ar.add(new student(10, "Guru"));
		ar.add(new student(45, "Manjual"));

		Collections.sort(ar, new Agecompare());

		Iterator<student> itr = ar.iterator();
		while (itr.hasNext()){
			student st = (student)itr.next();
			System.out.println(st.age+"  "+st.Name);
		}
	}

}
