package Problmes1;

public class Countno {

	public static void main(String[] args) {
		int no=32443;
		int count=0;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
System.out.println(count);
	}

}
