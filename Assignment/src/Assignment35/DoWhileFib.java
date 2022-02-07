package Assignment35;

public class DoWhileFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib3=0;
		do {
			int fib1=0;
			int fib2=1;
			
			System.out.print(fib1+" "+fib2+" ");
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			
			fib3++;
		}
		
		while (fib3<=100);
		//System.out.println(fib3);
	}

}
