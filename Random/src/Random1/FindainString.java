package Random1;

public class FindainString {

	public static void main(String[] args) 
	{
		String s1="ramaiah qspiders aeroplane akshay";
		String[] arr=s1.split(" ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			char[] ch=arr[i].toCharArray();
			for (int j = 0; j < ch.length; j++) 
			{
				if (ch[j]=='a')
				{
					System.out.println(arr[i]);	
					break;
				}
				
			}
 			/*if (arr[i].contains("a"))
			{
				System.out.println(arr[i]);
			}*/
			
		}
	
	}

}
