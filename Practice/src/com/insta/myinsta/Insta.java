package com.insta.myinsta;

public class Insta
{
	@SuppressWarnings("unused")
	private void pic()
	{
		System.out.println("private");
	}
	
	void settings()
	{
		System.out.println("default");
	}
	
	protected void profile()
	{
		System.out.println("protected");
	}
	
	public void bio()
	{
		System.out.println("public");
	}
}
