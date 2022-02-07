
public class revno11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=151;
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		//System.out.println(rev);
		if (rev==copy)
		{
			System.out.println("pal");
		} else {
			System.out.println("not");
		}
	}

}
