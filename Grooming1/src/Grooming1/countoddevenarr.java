package Grooming1;

public class countoddevenarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7};
		int oddCount=0;
		int evenCount=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2==0)
			{
				evenCount++;
			} else 
			{
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
