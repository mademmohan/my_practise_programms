package MohanQA.DemoMaven;

import java.util.Scanner;

public class BetweenPrimeNumbers {

	public static void isPrimeNumber() {
		

		Scanner sn = new Scanner(System.in);

		System.out.println("Please Enter Lower Number");
		int low = sn.nextInt();
		System.out.println("Please Enter higher Number");
		int high = sn.nextInt();

		while (low < high) {
			boolean flag = false;
			for (int i = 2; i < low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(low + " ");
			}
			low++;
		}

	}

	public static void main(String[] args) {
		isPrimeNumber();
	}

}
