package Problmes1;

public class Tesr111 {

	public static void main(String[] args) {
		int[] arr={2,3,4,5,6};
		int evenCount=0;
		int oddCount=0;
		int oddSum=0;
		int evenSum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]%2==0)
			{
				evenCount++;
				evenSum=evenSum+arr[i];
			}
			else
			{
				oddCount++;
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		System.out.println(oddSum);
		System.out.println(evenSum);

	}

}
