package MethodOverloading;

class AmazonOrders
{
	static void orders(int no)
	{
		System.out.println("The order no is "+no);
	}
	
	static void orders(String name)
	{
		System.out.println("The order name is "+name);
	}
	
	static void orders(int no,String name)
	{
		System.out.println("The order no and name is "+no+" "+name);
	}
	
	void orders(String name,int no)
	{
		System.out.println("The order name and no is "+name+" "+no);
	}
	
}

public class Amazon1 {

	public static void main(String[] args) 
	{
		AmazonOrders.orders(2);
		AmazonOrders.orders("Samsung");
		AmazonOrders.orders(4,"Laptop");
		
		AmazonOrders a1=new AmazonOrders();
		a1.orders("Bag",4);
		

	}

}
