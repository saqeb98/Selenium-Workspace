package star;

public class Sample11 {

	public static void main(String[] args) {
		int space=3;
		
		for (int i = 1; i <=4; i++)
		{	
			char ch='a';
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++)
			{
				System.out.print(ch);
				ch++;
			}
			space--;
			ch++;
			System.out.println();
		}
	}

}
