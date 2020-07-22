package MohanQA.DemoMaven;

public class Palindrome {
	
	public static void palindrome(int num)
	{
		int r;
		int temp;
		int Count=0;
		
		temp=num;
		
		while(num!=0)
		{
			r=num%10;
			System.out.println(r);
			Count=(Count*10)+r;
			num=num/10;
			
		}
		if(Count==temp)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
	public static void main(String[] args) {
		palindrome(454);
	}
}
