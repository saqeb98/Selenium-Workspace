package Random1;

public class ABCD {

	public static void main(String[] args) {
		String []arr={"pavan","dhawan","rohit"};
					   //0		 1		2
					// 01234		
		for (int i = 0; i < arr.length; i++) 
		{
			char []s1=arr[i].toCharArray();
			for (int j = 0; j < s1.length; j++)
			{
				if (s1[j]=='a')
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
