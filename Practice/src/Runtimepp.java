class Bank
{
	void intrest()
	{
		System.out.println("some intrest");
	}
}

class SBI extends Bank
{
	void intrest()
	{
		System.out.println("5%");
	}
}

class ICICI extends Bank
{
	void intrest()
	{
		System.out.println("3%");
	}
}
class HDFC extends Bank
{
	void intrest()
	{
		System.out.println("3%");
	}
}
class Stimulator
{
	static void man(Bank b1)
	{
		b1.intrest();
	}
}


public class Runtimepp 
{

	public static void main(String[] args) {
		SBI s1=new SBI();
		HDFC h1=new HDFC();
		ICICI i1=new ICICI();
		Stimulator.man(s1);
		Stimulator.man(h1);
		Stimulator.man(i1);
		String a1="1234";
		int x=Integer.parseInt(a1);
		System.out.println(x);
	}

}
