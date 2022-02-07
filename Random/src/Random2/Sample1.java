package Random2;

public class Sample1 {

	public static void main(String[] args) {
		String[] arr={"hello","ok","fine"};
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			char ch[]=arr[i].toCharArray();
			for (int j = 0; j < ch.length; j++)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
