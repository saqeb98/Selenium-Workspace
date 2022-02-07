package Random1;

public class Demo2 {

	public static void main(String[] args) {
		String s1="hi i am dda  hftsa akshay fine a";
		String arr[]=s1.split(" ");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			char[] ch=(arr[i].toCharArray());
			for (int j = 0; j < ch.length; j++) 
			{
				
			if (ch[j]=='a')
			{
				count++;
				System.out.println(arr[i]);
				
				break;
				
			}
			
		}
			
	}
		System.out.println(count+" "+"time's 'a' is repeating");
		

}
}
