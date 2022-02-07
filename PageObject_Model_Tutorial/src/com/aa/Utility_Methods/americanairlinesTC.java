package com.aa.Utility_Methods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*import com.aa.com.ChooseFlight;
import com.aa.com.HomePage;
import com.aa.com.PassengerDetails;
*/
public class americanairlinesTC extends Utility_MethodsOfAA {
	
	@Test(dataProvider="Data")
	public void Tc01(String source,String destination,String size/*,String Gender,
			String First,String Last,String Day,String Month,String Year,String Loyalty,
			String Redressnumber,String Knowntravelernumber,String PrimaryEmail,String ConfirmEmail*/) throws IOException {
		
		
		preCondition();
		
	/*	HomePage hm=new HomePage(driver);
		
		hm.enter_The_Value_for_Source(source);
		hm.clickActionForSource();
		hm.enter_The_Value_for_destination(destination);
		hm.clickActionFordestination();
		//adult dropdown
		hm.selectdropDown(size);
		//dept date
		hm.clickondeptdatecalender();
		
		hm.departDateselect();
		
		hm.oneWay();
		//SearchButton
		hm.search();
		
		
/*		ChooseFlight flight=new ChooseFlight(driver);
		flight.flight();
		flight.continuee();
		
		
		
		PassengerDetails pd=new PassengerDetails(driver);
		pd.gender(Gender);
		pd.firstName(First);
		pd.lastName(Last);
		pd.dropdownOfDay(Day);
		pd.dropdownOfDate(Month);
		pd.dropdownOfyear(Year);
		pd.loyaltydropdown(Loyalty);
		pd.redressnumber(Redressnumber);
		pd.knowntravelernumber(Knowntravelernumber);
		pd.primaryEamil(PrimaryEmail);
		pd.confirmEmail(ConfirmEmail);
		
*/		
	}
	
	/*
	
	@DataProvider(name="Data")
	public Object[][] data()
	{
		Object[][] value=new Object[1][3];
		value[0][0]="dfw";
		value[0][1]="mia";
		value[0][2]="3";
		
	/*	
		value[1][0]="M";
		value[1][1]="Rohan";
		value[1][2]="S";
		value[1][3]="25";
		value[1][4]="7";
		value[1][5]="1998";
		value[1][6]="52415";
		value[1][7]="56354";
		value[1][8]="548754";
		value[1][9]="rohan@gmail.com";
		value[1][10]="rohan@gmail.com";
*/	/*	
		return value;
	*/
	
	}
	
	
/*
}

	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	
	String s1="07:00";
	String s2="10:55";
	@FindBy(xpath="//span[@class='leftbound timeline-time timeline-time-departure ']")
	WebElement sources;
	
	Assert.assertEquals(s1, sources.getText());
	
	@FindBy(xpath="//span[@class='rightbound timeline-time timeline-time-arrival ']")
	WebElement dest;
	
	Assert.assertEquals(s2, dest.getText());
}
*/

