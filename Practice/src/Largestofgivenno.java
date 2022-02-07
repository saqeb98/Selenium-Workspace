import java.util.Scanner;

public class Largestofgivenno {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value");
		int no1=sc.nextInt();
		System.out.println("Enter the last value");
		int no2=sc.nextInt();
		sc.close();
		int evenSum=0;
		int oddSum=0;
		for (int i = no1; i <=no2; i++)
		{
			if (i%2==0)
			{
				evenSum=evenSum+(i*i);
				System.out.print("even number = "+i+" ");
			}
			else{
				oddSum=oddSum+(i*i);
				System.out.println("Odd number = "+i+" ");
			}
		}
		System.out.println("Even sum = "+evenSum+" ");
		System.out.print("Odd sum = "+oddSum+" ");
	}
	}


