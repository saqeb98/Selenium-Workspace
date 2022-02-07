import java.util.Scanner;

public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start no");
		int no=sc.nextInt();
		//int no=7;
		//int arr[]={10,20,30,54};
		boolean flag=true;
		for (int i = 2; i < no; i++)
		{
			if (no%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("not prime no "+no);
		}
		else if(flag==true)
		{
			System.out.println("prime no "+no);
		}
		
	}

}
