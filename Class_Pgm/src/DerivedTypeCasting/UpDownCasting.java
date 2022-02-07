package DerivedTypeCasting;

class Sample
{
	void disp()
	{
		System.out.println("Hello");
	}
}

class Demo extends Sample
{
	int a=44;
	void add()
	{
		System.out.println("add the number");
	}
}

public class UpDownCasting {

	public static void main(String[] args) 
	{
		System.out.println("Up casting");
		Sample s1=new Demo();
		s1.disp();
		System.out.println("Down casting");
		Demo d1=(Demo) s1;
		System.out.println(d1.a);
		d1.add();

	}

}
