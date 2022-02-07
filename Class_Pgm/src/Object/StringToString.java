package Object;
class Sample
{
	public String toString()
	{
		return "Hello";
	}
}
public class StringToString extends Object 
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		System.out.println(s1.toString());

	}

}
