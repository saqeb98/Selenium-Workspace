package Random2;

public class Sample6 {

	public static void main(String[] args) {
		String s1="helpe asdf hjkk adfre afbe";
		String []arr=s1.split(" ");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			
			char[] ch=arr[i].toCharArray();
			
			for (int j = 0; j < ch.length; j++) 
			{
				if (ch[j]=='e') 
				{
					System.out.println(arr[i]);
					break;
				}
				if (ch[j]=='a')
				{
					count++;
					
				}
				
			}
			System.out.println(count);
			
		}
		

	}

}
