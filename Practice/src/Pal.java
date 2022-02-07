
public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="racecar";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("Pal "+rev);
		}
	}
}
