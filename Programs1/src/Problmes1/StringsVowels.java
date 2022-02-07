package Problmes1;

public class StringsVowels {

	public static void main(String[] args)
	{
		String s1="HellHJGjglJYGjgytye6usSRaTDADTfgaauhho";
		int count =0;
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
					x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
			{
				System.out.print(x+" ");	
				count++;
			}
			
		}
		System.out.println(count);	

	}

}
