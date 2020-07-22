package MohanQA.DemoMaven;

import java.util.ArrayList;

public class Datatoarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> aa= new ArrayList<Integer>();
		aa.add(14);
		aa.add(10);
		aa.add(8);
		for(Integer data: aa)
		{
			System.out.println(data);
		}
		
	}

}
