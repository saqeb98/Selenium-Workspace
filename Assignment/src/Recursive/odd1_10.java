package Recursive;

public class odd1_10 
{
	static void odd(int no)
	{
		if (no<=10)
		{
			if (no%2!=0)
			{
				System.out.println(no);
			}
			no++;
			odd(no);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		odd(1);
	}

}
