
public class Amstr1 {

	public static void main(String[] args) {
		for (int i = 100; i <=999; i++) 
		{
			int no=i;
			int copy=no;
			int sum=0;
			while(no!=0)
			{
				int rem=no%10;
				int k=rem;
				int fact=1;
				for (int j = k; j>=1; j--) 
				{
					fact=fact*j;
				}
				sum=sum+fact;
				no=no/10;
			}
			
			
		if (sum==copy) 
		{
			System.out.println(sum);
		}
		}
	}

}
