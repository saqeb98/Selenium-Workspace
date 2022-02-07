package Constructor;

public class MainClass1 
{
	
	static
	{
		System.out.println("hello");
	}
	
	{
		System.out.println("Hi");
	}
	int id;
	String Name;
	MainClass1(int id,String Name)
	{
		this.id=id;
		this.Name=Name;
	}
	public static void main(String[] args) 
	{
		MainClass1 c1=new MainClass1(12,"Vikas");
		System.out.println(c1.id);
		System.out.println(c1.Name);
		
	}
}
