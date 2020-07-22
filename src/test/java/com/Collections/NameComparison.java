package com.Collections;

import java.util.Comparator;

public class NameComparison implements Comparator<student> {

	public int compare(student arg1, student arg2) {
		student s1= (student)arg1;
		student s2= (student)arg2;
		
		return s1.Name.compareTo(s2.Name);
	}

}
