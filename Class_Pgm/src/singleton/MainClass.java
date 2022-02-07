package singleton;
class Singleton
{
	static Singleton s1;
	int x=10;
	static int count=0;
	Singleton()
	{
		count++;
	}
	public static Singleton get()
	{
		if (count<1)
		{
			 s1=new Singleton();
		}
		return s1;
	}
	public static void set(int y)
	{
		s1.x=y;
	}
}
public class MainClass 
{

	public static void main(String[] args)
	{
		Singleton x1=Singleton.get();
		System.out.println(x1.x);
		Singleton x2=Singleton.get();
		System.out.println(x2.x);
		Singleton x3=Singleton.get();
		System.out.println(x3.x);
		Singleton.set(100);
		System.out.println(x1.x);
	}

}
