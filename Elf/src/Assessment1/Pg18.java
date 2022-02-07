package Assessment1;

public class Pg18 {

	public static void main(String[] args) {
		int[] arr1={12,34,22,18};
		int[] arr2={32,44,10,82,8,14};
		int arr1_length=arr1.length;
		int arr2_length=arr2.length;
		int arr3_length=arr1_length+arr2_length;
		int[] arr3=new int[arr3_length];
		for (int i = 0; i < arr1.length; i++)
		{
			arr3[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++)
		{
			arr3[arr1_length+i]=arr2[i];
		}
		for (int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
			
		}
	}

}
