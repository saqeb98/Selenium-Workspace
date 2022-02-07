package Random2;

public class Sample4 {

	public static void main(String[] args) 
	{
		String s1="hello how are you doing";
		String[] arr=s1.split(" ");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			char ch[]=arr[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				count++;	
			}
			
		}
		System.out.println(count);

	}

}
