package Problmes1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter the start no");
		int start=scc.nextInt();
		System.out.println("Enter the end number");
		int end =scc.nextInt();
		scc.close();
		for(int no=start;no<end;no++)
		{
		boolean flag=true;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				/*String s1="hi";
				System.out.println(Integer.parseInt(s)*/
			flag=false;
			break;
		}
		}
		
		if(flag==true)
		{
			System.out.println("Prime no "+no);
		}
		}
	}

}
