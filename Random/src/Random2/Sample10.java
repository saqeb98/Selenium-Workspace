package Random2;

public class Sample10 {

	public static void main(String[] args) {
		String s1="javaaa";
		char[] ch=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
