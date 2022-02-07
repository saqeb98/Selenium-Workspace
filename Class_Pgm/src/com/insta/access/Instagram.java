package com.insta.access;

public class Instagram 
{
	private void pass()
	{
		System.out.println("Only by me,private");
	}
	
	void profilePic()
	{
		System.out.println("frients default");
	}
	protected void comments()
	{
		System.out.println("Comments,protected");
	}
	public void bio()
	{
		System.out.println("any one,public");
	}
	public static void main(String[] args) 
	{
		new Instagram().pass();
	}
}
