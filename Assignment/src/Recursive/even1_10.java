package Recursive;

public class even1_10
{
	static void even(int no)
	{	
		if (no<=10)
		{
			if (no%2==0)
			{
				System.out.println(no);
			}
			no++;
			even(no);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even(1);
	}

}
