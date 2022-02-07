package MethodOverriding;

class Apple_v14
{
	void safari()
	{
		System.out.println("Browser control top of screen");
		
	}
}

class Apple_v15 extends Apple_v14
{
	void safari()
	{
		System.out.println("Browser control bottom of sceen");
	
		super.safari();
	}
}

public class MainClass1 {

	public static void main(String[] args)
	{
		Apple_v15 v15=new Apple_v15();
		v15.safari();
	}

}
