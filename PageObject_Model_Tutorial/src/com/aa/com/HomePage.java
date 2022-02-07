package com.aa.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aa.Utility_Methods.Utility_MethodsOfAA;



public class HomePage extends Utility_MethodsOfAA {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='reservationFlightSearchForm.originAirport']")
	WebElement toTextField;
	
	@FindBy(xpath="//a[text()='Dallas/Fort Worth (DFW), Texas, USA']")
	WebElement source;
	
	@FindBy(id="reservationFlightSearchForm.destinationAirport")
	WebElement fromTextField;
	
	@FindBy(xpath="//a[text()='Miami (MIA), Florida, USA']")
	WebElement destination;
	
	@FindBy(xpath="//select[@id='flightSearchForm.adultPassengerCount']")
	WebElement adultsDropDown;
	//deptdate
	@FindBy(xpath="(//button[@class='ui-datepicker-trigger'])[1]")
	WebElement departDatecalender;
	
	@FindBy(xpath="(//a[text()='8'])[1]")
	WebElement departDate;
	//oneWayJourney
	@FindBy(xpath="//span[text()='One way']")
	WebElement oneWayButton;
	//Search
	@FindBy(xpath="//input[@id='bookingModule-submit']")
	WebElement searchButton;
	
	
	
	public void enter_The_Value_for_Source(String value)
	{
		enter_value_edit_field(toTextField, value);
	}
	public void clickActionForSource()
	{
		clickaction(source);
	}
	
	public void enter_The_Value_for_destination(String value)
	{
		enter_value_edit_field(fromTextField,value);
	}
	
	
	public void clickActionFordestination()
	{
		clickaction(destination);
	}
	public void selectdropDown(String value)
	{
		select_value(adultsDropDown, value);
	}
	public void clickondeptdatecalender()
	{
		clickaction(departDatecalender);
	}
	
	
	
	public void departDateselect()
	{
		
		clickaction(departDate);
	}
	
	public void oneWay()
	{
		clickaction(oneWayButton);
	}
	
	public void search()
	{
		clickaction(searchButton);
	}
	
	
	
}

