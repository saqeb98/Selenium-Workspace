package Random1;

public class NestedIf {

	public static void main(String[] args)
	{
		int[] arr={2,5,7,8,9,3,6};
		int find=9;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]==find)
			{
				if (arr[i+2]%2==0)
				{
					System.out.println("odd");
				}
				else {
					System.out.println("even");
				}
			}
		}

	}

}
