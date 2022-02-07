package Stars;

public class AB12 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++)
		{
			char ch='D';
			for (int j = 1; j <=i; j++)
			{
				if (i%2!=0) 
				{
					System.out.print(ch);
					ch--;
				} else 
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
