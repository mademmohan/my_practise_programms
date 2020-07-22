package MohanQA.DemoMaven;

public class Pyramidofstars {
	public static void pyramidofStars()
	{
		for(int i=0; i<=5;i++)
		{
			System.out.println();
			for(int j=0; j<5-i ;j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<i;k++)
			{
				System.out.print("*  ");
			}
			
		}
		
	}
	public static void main(String[] args) {
		pyramidofStars();
	}

}
