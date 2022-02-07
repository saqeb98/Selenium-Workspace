package Random2;

public class Sample8 {

	public static void main(String[] args) {
		int[] arr={2,4,100};
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			int no=arr[i];
			while(no!=0)
			{
				
				sum=sum+(no*no);
				no=no/10;
				break;
				
			}
		}
		System.out.println(sum);

	}

}
