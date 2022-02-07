package Random2;

public class Tester {

	public static void main(String[] args) 
	{
		int[] arr={10,11,12,13,14};
		for (int i = 0; i <arr.length; i++) 
		{
			int fact=1;
			if (arr[i]%2==0)
			{
				int no=arr[i];
				
				for (int j = no; j >=1; j--)
				{
					fact=fact*j;
				}
				System.out.println(fact);
			}
			else
			{
				int no1=arr[i];
				int fact1=1;
				for (int j =no1 ; j >=1; j--)
				{
					fact1=fact1*j;
				}
				System.out.println(fact1);
			}
		}

	}

}
