package StringFun1;

public class MainClass1 {

	public static void main(String[] args)
	{
		String s1="javabaj";
		//         0123456
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("j"));
		System.out.println(s1.contains("va"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,6));
		System.out.println(s1.concat("Mava"));
		System.out.println(s1+" "+"mava");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.replace('v', 's'));
		
		StringBuffer s2=new StringBuffer("hello");
		System.out.println(s2.charAt(0));
		
		StringBuilder s3=new StringBuilder("Karnataka");
		System.out.println(s3.charAt(2));
		

	}

}
