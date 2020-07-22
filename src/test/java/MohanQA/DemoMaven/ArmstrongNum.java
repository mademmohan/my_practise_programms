package MohanQA.DemoMaven;

public class ArmstrongNum {
	
	public static void armNumber()
	{
		java.util.Scanner sn= new java.util.Scanner(System.in);
		System.out.println("Please enter input data");
		int input =sn.nextInt();
		int r,n,temp;
		int sum=0;
		temp=input;
		while(input!=0)
		{
			r=input%10;//reminder 
			sum=(sum*10)+r;
			input= input/10;
		}
		 
		if(temp==sum)
		{
			System.out.println("Given Number is Arm Strong Number");
		}
		else
		System.out.println("Given Number is Not Arm Strong Number");
		
	}
	public static void main(String[] args) {
	
		armNumber();
	}

}
