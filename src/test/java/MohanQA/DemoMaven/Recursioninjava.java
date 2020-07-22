package MohanQA.DemoMaven;

public class Recursioninjava {
	
	public Recursioninjava() {
		System.out.println("This is constructor");
	}
	
	public void m1()
	{
		System.out.println("Recurssion in Java");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Recursioninjava rr= new Recursioninjava();
		Recursioninjava rr1= (Recursioninjava)rr.clone();
		
	}

}
