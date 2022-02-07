package Problmes1;

public class CatDog {

	public static void main(String[] args) 
	{
		String s1="catdogcatdogcat";
		int catCount=0;
		int dogCount=0;
		
		for (int i = 0; i <=s1.length()-3; i++)
		{
			if (s1.substring(i, i+3).equals("cat"))
			{
				catCount++;
			}
			else if (s1.substring(i, i+3).equals("dog"))
			{
				dogCount++;
			}
					
		}
		System.out.println(catCount+" "+dogCount);
	}

}
