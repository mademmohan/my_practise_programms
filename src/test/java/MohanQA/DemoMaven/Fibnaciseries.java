package MohanQA.DemoMaven;

public class Fibnaciseries {
	
	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int count =20;
		
		for (int i = 2; i <= count; i++) {
			System.out.println(t1);
			int sum= t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}
