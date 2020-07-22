package MohanQA.DemoMaven;

public class Armstrongnumber {

	public static void armstrongNumber(int num) {
		int r;
		int temp;
		temp = num;
		int Cube = 0;
		while (num > 0) {
			r = num % 10;
			System.out.println(r);
			num = num / 10;
			System.out.println(num);
			Cube = Cube + (r * r * r);
			System.out.println(Cube);

		}
		
		if (temp==Cube) {
			System.out.println("Given number is armstrongnumber");
		}
		else
			System.out.println("Given number is not armstrongnumber");

	}

	public static void main(String[] args) {
		armstrongNumber(153);
	}

}
