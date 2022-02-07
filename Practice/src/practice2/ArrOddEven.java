package practice2;

public class ArrOddEven
{
	public static void main(String[] args) 
	{
		int[] arr={10,11,12,13,14,15};
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]%2==0) 
			{
				System.out.println("even no "+arr[i]);
			} else 
			{
				System.out.println("odd no "+arr[i]);
			}
		}
	}
}
