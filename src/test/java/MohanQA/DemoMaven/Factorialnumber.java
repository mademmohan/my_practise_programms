package MohanQA.DemoMaven;

public class Factorialnumber {
	
	
	
	public static void factorialNumber(int number)
	{
		int temp=1;
		for (int i = 1
				; i <= number; i++) {
			temp=temp*i;
			System.out.println(temp);
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		factorialNumber(5);
	}
}
