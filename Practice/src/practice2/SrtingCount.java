package practice2;

public class SrtingCount {

	public static void main(String[] args) 
	{
		String s1="hello";
		char[] arr=s1.toCharArray();
		int count=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			count++;
		}
		System.out.println(count);
	}

}
