package Random2;

import java.util.Scanner;

public class Sample11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start the number");
		int start=sc.nextInt();
		System.out.println("enter the end number");
		int end=sc.nextInt();
		sc.close();
		for (int i = start; i < end; i++)
		{
			boolean flag=true;
			for (int no= i; no <i; no++)
		{
			if(no%2==0)
			{
				flag=false;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("prime ");
		}
		else
		{
			System.out.println("not prime ");
		}
		}
	}
}
