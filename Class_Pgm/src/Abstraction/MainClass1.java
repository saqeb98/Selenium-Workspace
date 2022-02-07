package Abstraction;
interface Bank
{
	void intrest();
}

class SBI implements Bank
{
	public void intrest()
	{
		System.out.println("5%");
	}
}
class HDFC implements Bank
{
	public void intrest()
	{
		System.out.println("10%");
	}
}
class ICICI implements Bank
{
	public void intrest() 
	{
		System.out.println("12%");
	}
}
class Manager
{
	static void mang(Bank b1)
	{
		b1.intrest();
	}
}
public class MainClass1 
{

	public static void main(String[] args) 
	{
		SBI s1=new SBI();
		HDFC h1=new HDFC();
		ICICI i1=new ICICI();
		Manager   .        mang(s1);
		Manager.mang(h1);
		Manager.mang(i1);
		
		
		
	}

}
