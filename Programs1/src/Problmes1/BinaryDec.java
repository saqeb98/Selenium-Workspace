package Problmes1;

public class BinaryDec {

	public static void main(String[] args) {
		int no=1011;
		int temp=no;
		int dec=0;
		int base=1;
		while(temp!=0)
		{
			int rem=temp%10;
			temp=temp/10;
			dec=dec+(rem*base);
			base=base*2;
		}
		System.out.println(dec);
		
	}

}
