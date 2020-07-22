package MohanQA.DemoMaven;

public class countNumberofdigits {
	public static void m1()
	{
		int a=1234899;
		int count=0;
		
		while(a!=0)
		{
			 a=a/10;
			count++;
		}
		System.out.println("Total count of digits "+count);
	}
	public static void main(String[] args) {
		m1();
	}

}
