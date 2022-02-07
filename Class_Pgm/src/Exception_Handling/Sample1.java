package Exception_Handling;

public class Sample1 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		int arr[]={10,23,32,3,2};
		try
		{
			
			
			@SuppressWarnings("unused")
			int i=a/b;
		
		try
		{
			System.out.println(arr[15]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
	}
		catch (ArithmeticException e)
		{
			System.out.println("caught");
		}

		finally{
			System.out.println("hello");
		}
	
}
}
