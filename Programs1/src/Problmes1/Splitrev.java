package Problmes1;

public class Splitrev 
{
	static String rev(String s1)
	{
		String rev="";
		for (int i = s1.length()-1; i >=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		String s1="if you need job get star in java";
		String[] arr=s1.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(rev(arr[i]+" "));
		}
	}
	

}
