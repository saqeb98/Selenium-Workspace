import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int year=sc.nextInt();
		
		if (year%4==0 && year%100!=0 || year%400==0) 
		{
			System.out.println("its a leap year "+year);
		}
		else {
			System.out.println("not a leap year "+year);
		}
	}

}
