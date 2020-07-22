package MohanQA.DemoMaven;

public class Stringparindrome {
	
	public static void Parindrome(String datalength) 
	{
		String reverse = "";
		
		
		String temp;
		temp=datalength;
		for(int i=datalength.length()-1;i>=0;i--)
		{
			reverse=reverse+datalength.charAt(i);
			
		}
		System.out.println(reverse);
		if (reverse.equals(temp)) {
			System.out.println("Given number is parindrome");
		}
		else
			System.out.println("Given number is not parindrome");
	}
	public static void main(String[] args) {
		Parindrome("MOM");
	}

}
