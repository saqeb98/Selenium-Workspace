class Sample
{
	int y=10;
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("Hello");
	}
}

public class Upcast {

	public static void main(String[] args) {
		Sample s1=new Demo();
		System.out.println(s1.y);
		Demo d1=(Demo)s1;
		System.out.println(d1.y);
		d1.disp();
		
	}

}
