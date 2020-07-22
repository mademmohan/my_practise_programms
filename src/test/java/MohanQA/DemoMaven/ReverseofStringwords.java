package MohanQA.DemoMaven;

import java.util.Scanner;

public class ReverseofStringwords {
	Scanner snr= new Scanner(System.in);
	public static boolean isPrimeNumber(int Number)
	{
		if(Number<=1)
		{
			return false;
		}
		for (int i = 2; i < Number; i++) {
			if (Number%2==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Given Number is Prime: "+isPrimeNumber(17));
		
	}

}
