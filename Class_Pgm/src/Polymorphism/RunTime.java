package Polymorphism;

class Bank
{
	void intrest()
	{
		System.out.println("Some intrest");
	}
}

class SBI extends Bank
{
	void intrest()
	{
		System.out.println("5% intrest");
	}
}

class HDFC extends Bank
{
	void intrest()
	{
		System.out.println("12% intrest");
	}
}

class ICICI extends Bank
{
	void intrest()
	{
		System.out.println("11% intrest");
	}
}

class Stimulator
{
	static void man(Bank b1)
	{
		b1.intrest();
	}
}


public class RunTime {

	public static void main(String[] args) 
	{
		SBI s1=new SBI();
		HDFC h1=new HDFC();
		ICICI i1=new ICICI();
		
		Stimulator.man(s1);
		Stimulator.man(h1);
		Stimulator.man(i1);
	}

}
