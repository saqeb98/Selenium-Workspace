package Random1;

public class DecToBinary {

	public static void main(String[] args) {
		int no=17;
		int sum=0;
		while(no!=0)
		{
			//int rem=0;
			int rem=no%2;
			sum=sum+rem;
			no=no/2;
		}
		System.out.println(sum);

	}

}
