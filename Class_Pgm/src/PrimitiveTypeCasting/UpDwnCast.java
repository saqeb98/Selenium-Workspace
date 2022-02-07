package PrimitiveTypeCasting;
class Demo
{
	int y=22;
}
class Sample extends Demo
{
	void fo()
	{
		System.out.println("Hello");
	}
}
public class UpDwnCast 
{
	public static void main(String[] args) 
	{
		System.out.println("***Up Casting***");
		Demo d1=new Sample();
		System.out.println(d1.y+"\n");
		System.out.println("***Down Casting***");
		Sample s1=(Sample)d1;
		System.out.println(s1.y);
		s1.fo();

	}

}
