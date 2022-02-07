package Random1;

public class PrimeRange {

	public static void main(String[] args) 
	{
		for (int no = 10; no <=100; no++)
		{
			boolean flag=true;
			for (int j = 2; j <no; j++)
			{
				if (no%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true) {
				
					System.out.println("Prime = "+no);
			} else {
				System.out.println("not prime = "+no);
			}
		}

	}

}
