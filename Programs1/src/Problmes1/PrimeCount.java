package Problmes1;

public class PrimeCount {

	public static void main(String[] args) {
		int no=1234;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==1||rem==2||rem==3||rem==5||rem==7)
			{
				count++;
			}
		no=no/10;
		}
		System.out.println(count);
	}

}
