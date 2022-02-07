package Problmes1;

public class Vowles1 {

	public static void main(String[] args) 
	{
		String s1="HelloJava";
		int count =0;
		char[] arr=s1.toCharArray();
		
		for (int i = 0; i <arr.length; i++) 
		{
			if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'
				||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') 
			{
				count++;
				System.out.print("The vowles are "+arr[i]+" ");
			}
			
		
		}
		System.out.println("\nThe count of vowles is"+count);
	}

}
