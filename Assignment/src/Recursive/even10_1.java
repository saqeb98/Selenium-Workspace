package Recursive;

public class even10_1 
{
	static void even(int no)
	{
		if (no>=1) 
		{
			if (no%2==0)
			{
				System.out.println(no);
			}
			no--;
			even(no);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even(10);
	}

}
