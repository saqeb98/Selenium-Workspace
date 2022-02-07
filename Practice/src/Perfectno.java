import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		
		int sum=0;
		for (int i = 1; i<=no/2; i++) 
		{
			if (no%i==0)
			{
				sum=sum+i;
			}
			
		}
		if (sum==no) 
		{
			System.out.println("perfect no "+no);
		}
		
	}

}
