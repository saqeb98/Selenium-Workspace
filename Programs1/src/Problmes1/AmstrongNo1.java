package Problmes1;

public class AmstrongNo1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
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
				System.out.println(sum);
			}
	
		}
	}
