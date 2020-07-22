package MohanQA.DemoMaven;

public class Childclass extends Parentclass {
	public void m1() {
		int a=10;
		if (a==10) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}

	}
	
	public void m2()
	{
		String m="Guru Mohan Reddy";
		
		char[] ch= m.toCharArray();
		System.out.println(ch.length);
		for (int i = ch.length-1; i < ch.length; i++) {
			System.out.println(ch[i]);
			
		}
		
		for (int i = 0, j=0; i < 10; i++) {
			System.out.println("Guru"+i+"   "+"Mohan"+j+"");
		}
		
	}
	public static void main(String[] args) {
		
		
		Childclass c = new Childclass();
		
		c.m2();
		
		
		
	}

}
