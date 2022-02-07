import java.util.Scanner;

public class Perfectno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int no=sc.nextInt();
		int sum=0;
		for (int i = 1; i<=no/2; i++) 
		{
			if (no%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
