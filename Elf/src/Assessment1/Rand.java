package Assessment1;

public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1={12,34,22,18};
		int[] arr2={32,44,10,82,8,14};
		{
			for (int i = 0; i < arr1.length; i++)
			{
				for (int j = 0; j < arr2.length; j++)
				{
					System.out.print(arr1[i]+" "+arr2[j]);
					break;
				}
			}
		}
	}

}
