
public class FirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1234;
		int count=0;
		int sum=0;
		int copy=no;
		int sum1=0;
		int copy1=no;
		
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		for (int i = 1; i<=count; i++) 
		{
			if (i==1||i==count)
			{
				sum=sum+(copy%10);
			}
			copy=copy/10;
		}
		System.out.println(sum);
		for (int i = 1; i<=count; i++) 
		{
			if (i==2||i==count-1)
			{
				sum1=sum1+(copy1%10);
			}
			copy1=copy1/10;
		}
		System.out.println(sum1);
		if (sum1==sum) 
		{
			System.out.println("xylem");
		}
	}

}
