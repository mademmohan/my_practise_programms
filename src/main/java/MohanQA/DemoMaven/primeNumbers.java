package MohanQA.DemoMaven;

public class primeNumbers {
	
	public static boolean isPrimeNumber(int Num)
	{
		if(Num<=1)
		{
			return false;
		}
		for(int i=2; i<Num;i++)
		{
			if(Num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println("Given Number is "+20+" "+isPrimeNumber(20));
	}

}
