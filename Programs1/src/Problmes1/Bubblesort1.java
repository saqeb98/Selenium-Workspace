package Problmes1;

public class Bubblesort1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={50,55,23,38,12,3};
		for(int j=0;j<arr.length-1;j++)
		{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i])
			{
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		}
		System.out.println(arr[0]+" First largest");
		System.out.println(arr[1]+" Second largest");
		System.out.println(arr[2]+" Third largest");
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}*/
		
}
}
