package MohanQA.DemoMaven;

import java.util.Scanner;

public class CheckPrimeNumberareNot {

	public static boolean isPrimeNumberNot() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Number");

		int input = sn.nextInt();

		if (input <= 1) {
			return false;

		}

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return true;
			}
		}
		return true;

	}
	
	public static void main(String[] args) {
		System.out.println("Given Number is "+""+" "+isPrimeNumberNot());
	}

}
