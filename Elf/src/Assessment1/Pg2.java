package Assessment1;
class RevString
{
	static void rev(String s1)
	{
		String rev="";
		for (int i = s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
	
	
}
public class Pg2 {

	public static void main(String[] args) 
	{
		RevString.rev("ELF2021SELENIUM");
	}

}
