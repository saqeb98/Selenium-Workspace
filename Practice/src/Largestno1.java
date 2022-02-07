
public class Largestno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,35,76,45,48,34,23,24,11,1};
		int max=arr[0];
		int secmax=arr[0];
		int thirdmax=arr[0];
		for (int i = 0; i<=arr.length-1; i++) 
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
			else if (arr[i]>secmax&&arr[i]!=max) 
			{
				secmax=arr[i];
			}
			else if (arr[i]>thirdmax&&arr[i]!=max&&arr[i]!=secmax) 
			{
				thirdmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(thirdmax);
	}

}
