
public class Happyno 
{
	public static void main(String[] args)
	{
		int no=32;
		int res=no;
		while(res!=1&&res!=4)
		{
			
			int sum=0;
			no=res;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		res=sum;
	}
		if (res==1)
		{
			System.out.println("res");
		}
}
}