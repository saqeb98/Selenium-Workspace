package Assessment1;

public class Pg14 {

	public static void main(String[] args) 
	{
		int[] arr={28,45,36,87,66,55,99};
		int maxNumber=arr[0];
		int secNumber=arr[0];
		int thirdNumber=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>maxNumber)
			{
				secNumber=maxNumber;
				maxNumber=arr[i];
			}
			else if(arr[i]>secNumber&&arr[i]!=maxNumber)
			{
				thirdNumber=secNumber;
				secNumber=arr[i];
			}
			else if(arr[i]>thirdNumber&&arr[i]!=secNumber)
			{
				thirdNumber=secNumber;
				thirdNumber=arr[i];
			}
		}
		System.out.println("The max number is "+maxNumber);
		System.out.println("The max number is "+secNumber);
		System.out.println("The max number is "+thirdNumber);
	}

}
