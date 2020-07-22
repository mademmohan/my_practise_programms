package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	int  a;
	static String collegeName;
	public SetInterface(int a, String CollegeName) {
		this.a= a;
		this.collegeName= CollegeName;
	}
	
	public static void main(String[] args) {
		SetInterface set1= new SetInterface(1, "Sarada High School");
		SetInterface set2= new SetInterface(2, "GovtSchool");
		SetInterface set3= new SetInterface(3, "Delhi Public School");
		Set<SetInterface>data= new HashSet();
		data.add(set1);
	}

}
