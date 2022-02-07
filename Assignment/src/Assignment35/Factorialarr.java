package Assignment35;

public class Factorialarr {

	public static void main(String[] args) 
	{
		int []arr={2,4,6,8};
		
		for (int i = 0; i < arr.length; i++)
		{
			int fact=1;
			for (int j = arr[i]; j >=1; j--)
			{
				fact=fact*j;
				
			}
			System.out.println(fact);
		}

	}

}
