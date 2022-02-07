package Random1;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		sc.close();
		boolean flag=true;
		for (int i = 2; i <no; i++)
		{
			if (no%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag==false)
		{
			System.out.println("no is not a prime no "+no);
		}
		else
		{
			System.out.println("no is prime no "+no);
		}
	}
}
