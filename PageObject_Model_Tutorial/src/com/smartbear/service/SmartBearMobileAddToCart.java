package com.smartbear.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.utilityFunction.*;
public class SmartBearMobileAddToCart  extends Utiliy_Functions{
	public SmartBearMobileAddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCartButton;
	
	public void cartbutton() {
		clickaction(addToCartButton);
	}
	
	String s1="$978.00 excl tax";
	@FindBy(xpath="//div[@class='sub-total price']")
	WebElement compareString;
	
	
	public void compare()
	{
		String compare=compareString.getText();
		Assert.assertEquals(s1, compare,"price is not matching");
		System.out.println("price is matching");
	}
	
	
	
	
}
