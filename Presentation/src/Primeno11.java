import java.util.Scanner;

public class Primeno11 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start no");
		int start=sc.nextInt();
		System.out.println("Enter the end no");
		int end=sc.nextInt();
		
		for(int no=start;no<end;no++)
		{
			boolean flag=true;
			for (int i = 2; i < no; i++) 
			{
				if (no%i==0) 
				{
					flag=false;
					break;
				}
			}
			if (flag==true) 
			{
				System.out.println("Prime no is "+no);
			}
		}
	}

}
