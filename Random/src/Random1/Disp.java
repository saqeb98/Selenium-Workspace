package Random1;

public class Disp {

	public static void main(String[] args) {
		int no=888888;
		int sum=0;
		
		int sum1=0;
		while(no!=0||sum>9)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		int copy=sum;
		
		while(copy!=0)
		{	
			int rem1=copy%10;
			sum1=sum1+rem1;
			copy=copy/10;
		}
		System.out.println(sum1);
	}
	}


