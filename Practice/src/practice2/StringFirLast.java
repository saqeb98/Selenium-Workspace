package practice2;

public class StringFirLast {

	public static void main(String[] args) 
	{
		String s1="hellojava";
		String s2=s1;
		char[] arr=s1.toCharArray();
		String rev="";
		for (int i = s2.length()-1; i>=0;i--) 
		{
			rev=rev+s2.charAt(i);
		}
		System.out.println(rev);
		
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i]==arr[arr.length-1] || arr[i]==arr[0])
			{
				System.out.print(arr[i]+" ");
			}
			//if(arr[i]==arr[0]||arr[i]==arr[arr.length-1])
			//{
				//System.out.print(arr[i]+" ");
			//}
		}

	}

}
