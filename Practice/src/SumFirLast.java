
public class SumFirLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1234;
		int copy=no;
		int count=0;
		int sum=0;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		for (int i = 1; i<=count; i++)
		{
			if (i==1||i==count) 
			{
				
				sum=sum+copy%10;
			}
			copy=copy/10;
		}
		System.out.println(sum);
		
	}

}
