package PassByRefrence;
class Java
{
	void javaPoint()
	{
		int no=5;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}
public class Google 
{

	public static void main(String[] args) 
	{
		Java j1=new Java();
		Std1.prob1(j1);
		Std2.prob1(j1);
	}

}
class Std1
{
	static void prob1(Java j2)//new java
	{
		j2.javaPoint();
	}
}
class Std2
{
	static void prob1(Java j3)
	{
		j3.javaPoint();
	}
}
