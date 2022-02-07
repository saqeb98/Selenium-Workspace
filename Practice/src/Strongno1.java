
public class Strongno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145;
		int copy=no;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			int k=rem;
			int fact=1;
			
			for(int j=k;j>=1;k--)
			{
				fact=fact*k;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Strong");
			
		}
		else{
			System.out.println("not");
		}
	}
		
	}

