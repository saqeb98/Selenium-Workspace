package practice2;

public class ArrAddSqr {

	public static void main(String[] args) {
		int arr[]={2,10};
		int sum=0;
		//int no=0;
		for (int i = 0; i < arr.length; i++)
		{
			//while(arr[i]!=0)
			
			//arr[i]=no;
			sum=sum+arr[i]*arr[i];
			//sum=sum+rem*rem;
			//arr[i]=arr[i]/10;
			//no=no/10;
		}
		System.out.println(sum);
	}

}
