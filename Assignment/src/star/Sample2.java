package star;

public class Sample2 {

	public static void main(String[] args) {
		int space=3;
		int no=1;
		for (int i = 1; i <=4; i++)
		{
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=no; k++)
			{
				System.out.print(k%2);
			}
			space--;
			no++;
			System.out.println();
		}

	}

}
