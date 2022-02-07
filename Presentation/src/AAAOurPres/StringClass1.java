package AAAOurPres;

public class StringClass1 {

	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
	}

}
