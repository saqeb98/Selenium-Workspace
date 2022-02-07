package Assessment1;

import java.util.Scanner;

public class Sum0fMaxNo {

	public static void main(String[] args) 
	{
		int[] arr={28,45,36,87,66,55,99};
		int ft=0;
		int st=0;
		int tt=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]>ft)
			{
				st=ft;
				tt=st;
				ft=arr[i];
			}
			else if(arr[i]>st)
			{
				tt=st;
				st=arr[i];
			}
			else{
				tt=arr[i];
			}
		}
		System.out.println(ft);
		System.out.println(st);
		System.out.println(tt);
	}

}
