package MohanQA.DemoMaven;

public class Assignment1 {
	int a=10;
	String b="Guru";
	public static void m1()
	{
		
		Assignment1 asa= new Assignment1();
		System.out.println(asa.a);
		System.out.println(asa.b);
	}
	
	public static void m2()
	{
		Assignment1 aa= new Assignment1();
		System.out.println(aa.a);
		System.out.println(aa.b);
		
	}
	public static void main(String[] args) {
		Assignment1.m1();
		Assignment1.m2();
	}

}
