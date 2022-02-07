package Random2;
public class Sample5 
{
	public static void main(String[] args) 
	{
		String[] arr={"hello","help","ok","goood"};
		for (int i = 0; i < arr.length; i++) 
		{
			if (i==0||i==arr.length-1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
