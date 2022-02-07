package Assessment1;

class Swap
{
static void swap(int a,int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a ="+a);
	System.out.println("b ="+b);
}
}

public class SwapWithoutThirdVariable {

	public static void main(String[] args)
	{
		Swap.swap(10,20);
	}

}
