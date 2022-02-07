package ObjectClass;


public class MainClass1 {
	public String toString()
	{
		return "hello";
	}
	public static void main(String[] args) 
	{
	MainClass1 o1=new MainClass1();
	System.out.println(o1);
	System.out.println(o1.hashCode());
	MainClass1 o2=new MainClass1();
	System.out.println(o1.equals(o2));
	
	MainClass1 o3=new MainClass1();
	MainClass1 o4=o3;
	System.out.println(o4.equals(o3));
}
}