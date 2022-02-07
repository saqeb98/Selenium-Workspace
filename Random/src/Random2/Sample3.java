package Random2;

public class Sample3 {

	public static void main(String[] args) {
		int[] arr={13,12,15,16,17,19};
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag=true;
			for (int j = 2; j < arr[i]; j++)
			{
				if (arr[i]%2==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true) 
			{
				System.out.println("prime no "+arr[i]);
			}
			else{
				System.out.println("not a prime no "+arr[i]);
			}
		}
		

	}

}
