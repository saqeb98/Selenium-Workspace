
public class Amstrongno {

	public static void main(String[] args)
	{
		for(int i=100;i<=999;i++)
		{
		int no=i;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Amstrong no "+sum);
		}
		}
		}

}
