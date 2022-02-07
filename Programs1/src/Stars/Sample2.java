package Stars;

public class Sample2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int rows=5;
		for (int i=1; i<=4; i++) 
        { 
            // Print space in decreasing order 
            for (int j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=i; k++)
            {
                System.out.print("@ ");
            }
            System.out.println();
        }
			
		
	}
	}


