package Problmes1;

import java.util.Scanner;

public class Qspider1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		
		char arr[]=s1.toCharArray();
		for (int i = 1; i <=3; i++) 
		{
			
		
		char temp=arr[0];
		for (int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=temp;
		}
		for (int k = 0; k<s1.length(); k++)
		{
			System.out.print(arr[k]);
		}
	}
}
		
	


