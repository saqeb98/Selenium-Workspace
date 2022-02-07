
public class Arrfirstlastsumsqr {

	public static void main(String[] args) {
		
		int arr[]={302,202,505,802};
		int count=0;
		int sum=0;
		for (int i = 0; i < arr.length; i++)
		{
			int no=arr[i];
			int copy=no;
			while(no!=0)
			{
				no=no/10;
				count++;
			}
		
			for (int j = 0; j <=count; j++)
			{
				if (i==1||i==count)
				{
					sum=sum+(copy%10);
				}
				copy=copy/10;
			}
		}
		
	}

}
