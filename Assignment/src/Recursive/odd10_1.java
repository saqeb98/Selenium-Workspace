package Recursive;

public class odd10_1 {
	static void odd(int no)
	{
		if (no>=1)
		{
			if (no%2!=0)
			{
				System.out.println(no);
			}
			no--;
			odd(no);
		}
	}
	public static void main(String[] args) 
	{
		
		odd(10);
	}

}
