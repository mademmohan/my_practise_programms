package MohanQA.DemoMaven;

public class StaticVsNonstatic {
	int a=10;
	static int b=20;
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		this.m2();
	}

	public static void m2()
	{
		System.out.println();
	}
}
