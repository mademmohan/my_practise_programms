package MohanQA.DemoMaven;

public class EvenorOddNumbers {
	public static void m1()
	{
		int [] a={1,2,4,5,8,9,11};
		
		System.out.print("Print of even numbers");
		 
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
				
		}
		
		System.out.print("Print of Odd numbers");
		 
		for(int i=0; i<a.length; i++)
		{
			if((a[i]%2)!=0)
			{
				System.out.print(a[i]+" ");
			}
				
		}
	}
	public static void main(String[] args) {
		m1();
	}

}
