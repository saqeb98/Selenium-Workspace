package practice2;

public class PrimenoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,7,8,9,1,2};
		
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag=true;
			for (int j = 2; j < arr.length; j++)
			{
				if (arr[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==false)
			{
				System.out.println("not a prime no "+arr[i]);
			}
		}
	}

}
