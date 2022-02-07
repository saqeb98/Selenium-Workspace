import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		
		int no=n*n;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		if (n==sum) 
		{
		System.out.println(n+" is a neon number");	
		}
	}

}
