package Assessment1;
class Occ
{
	static void count(String s1)
	{
		String[] arr=s1.split(" ");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			char[] ch=(arr[i].toCharArray());
			for (int j = 0; j < ch.length; j++) 
			{
				if (ch[j]=='h')
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
public class Pg5 {

	public static void main(String[] args) 
	{
		Occ.count("hi hello welcome to your home town");

	}

}
