package practice2;

public class ArrSumEvenOdd {

	public static void main(String[] args) {
		int[] arr={10,20,3,5};
		int sum=0;
		for (int i = 0; i < arr.length; i++)
		{
			//int rem=arr[i]%10;
			if (arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			//arr[i]=arr[i]/10;
		}
		System.out.println(sum);
	}

}
