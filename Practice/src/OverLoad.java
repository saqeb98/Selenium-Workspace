class Amazon
{
	static void Orders(int no)
	{
		System.out.println("The order number is "+no);
	}
	static void Orders(String name)
	{
		System.out.println("The order name is "+name);
	}
}

public class OverLoad 
{
	public static void main(String[] args) {
		Amazon.Orders(75);
		Amazon.Orders("Mobike");
	}
}
