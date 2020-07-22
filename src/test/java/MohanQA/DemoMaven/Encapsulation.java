package MohanQA.DemoMaven;

public class Encapsulation {

	private  int price;
	private  String name;

	public int getprice() {
		return price;
	}
	public void setPrice(int defineprice)
	{
		this.price=defineprice;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String Setname)
	{
		this.name=Setname;
	}
	
	
		
	public String customername()
	{
		return name;
		
	}
	
	private void m1()
	{
		System.out.println("Private m1 method");
	}

	}


