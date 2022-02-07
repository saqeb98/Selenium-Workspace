package Problmes1;

public class Largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={28,54,35,88,12,99};
		int max1=arr[0];
		int max2=arr[0];
		int max3=arr[0];
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i]>=max1)
			{
				max1=arr[i];
			}
			else if (arr[i]>max2&&arr[i]!=max1)
			{
				max2=arr[i];
			}
			else if (arr[i]>max3&&arr[i]!=max1&&arr[i]!=max2)
			{
				max3=arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}

}
