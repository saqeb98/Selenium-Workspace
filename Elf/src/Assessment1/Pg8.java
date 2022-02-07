package Assessment1;

public class Pg8 {

	public static void main(String[] args) {
		String s1="hi hello welcome hello hi bangalore";
		String[] arr=s1.split(" ");
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i].equalsIgnoreCase(arr[j]))
				{
					System.out.print(arr[j]+" ");
					count++;
					
				}
			}
		}
		System.out.print(count);

	}

}
