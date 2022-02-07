package Random2;

public class Sample9 {

	public static void main(String[] args) {
		String s1="hello";
		for (int i = 0; i <=s1.length()-1; i++)
		{
			if (i==0||i==s1.length()-1)
			{
				System.out.println(s1.charAt(i));
			}
		}

	}

}
