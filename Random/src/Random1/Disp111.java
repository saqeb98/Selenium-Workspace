package Random1;

public class Disp111 {

	public static void main(String[] args) {
		int no=888888;
		int sum=0;
		while(no!=0||sum>9)
		{
			if(no==0)
			{
				no=sum;
				sum=0;
			}
			sum=sum+(no%10);
			no=no/10;
		}
		System.out.println(sum);

	}

}
