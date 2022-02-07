package com.OrangeHrm;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TCOfOrangeHRM extends Utility_MethodOfOrangeHRM {
	
	
	@Test(dataProvider="Data")
	public void TC01(String Username,String Password) throws IOException 
	{
		preCondition();
	
		LoginPage lp=new LoginPage(driver);
		lp.login(Username);
		lp.pwd(Password);
		lp.loginButton();
		
		adminPage ap=new adminPage(driver);
		ap.admin();
		
		addpage ad=new addpage(driver);
		ad.add();
		
		

	}
	@Test(dataProvider="userData")
	public void tc02(String User,String EName,String FName,String Pwd,String ConfPwd)
	{
		
		
		AddUsrerPage aup=new AddUsrerPage(driver);	
		aup.userRole(User);
		aup.empname(EName);
		aup.empnamedropdown();
		aup.userName(FName);
		aup.pwd(Pwd);
		aup.confpwd(ConfPwd);
		aup.save();
		
		driver.close();
		
		
	}

	@DataProvider(name="Data")
	public Object[][] data()
	{
		Object[][] value=new Object[1][2];
		value[0][0]="Admin";
		value[0][1]="admin123";
		return value;
	}
		@DataProvider(name="userData")
		public Object[][] data1()
		{	
		Object[][] value=new Object[1][5];
		value[0][0]="2";
		value[0][1]="joe";
		value[0][2]="Rohan";
		value[0][3]="rohan1234";
		value[0][4]="rohan1234";
		
		
		return value;
	}
}

