package com.Collections;

public class student implements Comparable<student> {
	int age;
	String Name;
	public static String CollegeName="KSRM";
	 public student(int age, String Name) {
		 this.age= age;
		 this.Name=Name;
	}

	public int compareTo(student st) {
		System.out.println("Hello To this world");
		if (age==st.age) {
			return 0;
		}
		else if (age>st.age) {
			return 1;
		}
		else if (age<st.age) {
			return -1;
		}
		return 10;
		
		
	}
	
	

}
