package Problmes1;

public class Factorial1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		int fact=1;
		
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
			System.out.print(i+"*");
		}
		System.out.print("=");
		System.out.println(fact);
		
	}
}
