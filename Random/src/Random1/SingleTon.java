package Random1;
class Single
{	
	static Single s1;
	int x=100;
	static int count=0;
	private Single()
	{
		count++;
	}
	public static Single get()
	{
		if(count<1)
		{
		 s1=new Single();
		}
		return s1;
	}
	public static void set(int no)
	{
		s1.x=no;
	}
}
public class SingleTon 
{
	public static void main(String[] args) 
	{
		Single a1=Single.get();
		System.out.println(a1.x);
		Single a2=Single.get();
		System.out.println(a2.x);
		
		Single.set(500);
		System.out.println(a2.x);
		
		Single.set(1100);
		System.out.println(a2.x);
		Single.set(5010);
		System.out.println(a1.x);
	}
}
