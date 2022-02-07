package Problmes1;

public class SumOfSqOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=3423234;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2!=0)
			{
				sum=sum+(rem*rem);
			}
			no=no/10;
		}
		System.out.println(sum);
		
		
	}

}
