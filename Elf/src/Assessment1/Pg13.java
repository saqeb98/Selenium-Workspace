package Assessment1;

public class Pg13 {

	public static void main(String[] args) {
		int[] arr={28,45,36,87,66,55,99};

		for (int i = 0; i < arr.length; i++)
		{	
			for (int j = 1; j < arr.length; j++)
			{
				if (arr[j-1]<arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			int x=arr[0]+arr[1]+arr[2];
			System.out.println(arr[0]+"+"+arr[1]+"+"+arr[2]+"="+x);
			//System.out.print(arr[0]+"+"+arr[1]+"+"+arr[2]+"="+arr[0]+arr[1]);
			//System.out.println(" "+arr[1]+" ");
			break;
		}

	}

}
