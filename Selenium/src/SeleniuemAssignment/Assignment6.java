package SeleniuemAssignment;

public class Assignment6 {

	public static void main(String[] args) 
	{
		String s1="racecar";
		String rev="";
		for (int i = s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		if (s1.equalsIgnoreCase(rev))
		{
			System.out.println("Palandrome");
		} else {
			System.out.println("not a palandrome");

		}

	}

}
