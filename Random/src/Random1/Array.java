package Random1;

public class Array {

	public static void main(String[] args) 
	{
		String s1="hella olla afd gdfa dsf";
		String[] arr=s1.split(" ");
		for (int i = 0; i < arr.length; i++)
		{
			char[] ch=arr[i].toCharArray();
			for (int j = 0; j < ch.length; j++) 
			{
			if (ch[j]=='a')
			{
				System.out.println(arr[i]);
			}
		}

	}

	}
}
