package AAAOurPres;

public class ObjectsClass extends Object
{
	public String toString()
	{
		return "hello";
	}
	public static void main(String[] args) 
	{
	ObjectsClass o1=new ObjectsClass();
	System.out.println(o1);
	System.out.println(o1.hashCode());
	ObjectsClass o2=new ObjectsClass();
	System.out.println(o1.equals(o2));
	
	ObjectsClass o3=new ObjectsClass();
	ObjectsClass o4=o3;
	System.out.println(o4.equals(o3));

}
}
