package Assessment1;
class RevNo
{
	static void rev(int no)
	{
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev);
	}
}
public class Pg3 {

	public static void main(String[] args)
	{
		RevNo.rev(123145);

	}

}
