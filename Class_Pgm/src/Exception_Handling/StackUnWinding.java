package Exception_Handling;

public class StackUnWinding 
{
	static void disp3()
	{
		@SuppressWarnings("unused")
		int i=1/0;
	}
	static void disp2()
	{
		disp3();

	}
	static void disp1()
	{
		disp2();
	}
	public static void main(String[] args) 
	{
		try{
			disp1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println("handled");
		}
		finally{
			System.out.println("fine");
		}

	}

}
