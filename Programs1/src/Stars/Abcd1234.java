package Stars;

public class Abcd1234 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++)
		{
			char ch='A';
			for (int j = 1; j <=4; j++)
			{
				if (i%2!=0)
				{
					System.out.print(ch);
					ch++;
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
