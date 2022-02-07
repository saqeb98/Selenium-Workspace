package Assignment33;

class Student
{
	private int regNo=158;
	public int getRegNo()
	{
		return regNo;
	}

}

public class MainClass4 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1.getRegNo());
	}
}
