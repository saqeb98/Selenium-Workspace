
public class Bubble1 {

	public static void main(String[] args) 
	{
		int[] arr={50,40,30,20,10};
		for (int j = 0; j < arr.length; j++) 
		{
			
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i-1]>arr[i]) 
			{
				int temp =arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+" ");
		}

	}

}
