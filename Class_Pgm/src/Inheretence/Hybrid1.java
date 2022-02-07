package Inheretence;
class Sample
{
	int y=39;
}

class Demo extends Sample
{
	int x=32;
}

class Tester extends Demo
{
	void co()
	{
		System.out.println("Hi");
	}
}

class Cool extends Sample
{
	void disp()
	{
		System.out.println("It's cold here");
	}
}

public class Hybrid1 {

	public static void main(String[] args) 
	{
		Tester t1=new Tester();
		System.out.println(t1.y);
		System.out.println(t1.x);
		t1.co();
		System.out.println();
		Cool c1=new Cool();
		System.out.println(c1.y);
		c1.disp();
	}

}
