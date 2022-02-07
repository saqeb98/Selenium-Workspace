package com.insta.accesss;

public class Instagram {
	private int pass()
	{
		int a=10;
		System.out.println("Password is private");
		return a;
	}
	public int getPass()
	{
		
		int x=pass();
		return x;
		
	}
	
	protected void comment()
	{
		System.out.println("Comment is protected");
	}
	void profilePic()
	{
		System.out.println("Visibe to friends default");
	}
	public void bio()
	{
		System.out.println("Anyone can access as it is public");
	}
}
