package practice2;

import java.util.Scanner;

public class XylenAndPhloem {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int copy=no;
		int sum=0;
		int count=0;
		int sum1=0;
		int copy1=no;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		for (int i = 1; i<=count; i++)
		{
			{
			if (i==1||i==count)
			{
				sum=sum+(copy%10);
			}
			else if(i!=1||i!=count)
			{
				sum1=sum1+(copy1%10);
			}
			copy=copy/10;
			copy1=copy1/10;
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		if (sum==sum1)
		{
			System.out.println("xylem");
		}
		else
		{
			System.out.println("Phloem");
		}
	}

}
