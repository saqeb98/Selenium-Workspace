package selenium1;
class Swap
{
static void swap(int a,int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
public class Pg1 
{
	public static void main(String[] args) 
	{
		Swap.swap(10,20);
		

	}

}
