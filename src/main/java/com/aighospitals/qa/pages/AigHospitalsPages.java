package com.aighospitals.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class AigHospitalsPages  extends SeleniumUtils
{
	@FindBy(xpath="(//span[text()='About us'])[2]")
	WebElement aboutUs;
	
	@FindBy(xpath="(//a[contains(text(),'Chairman')])[3]")
	WebElement chairmanMessage;
	
	@FindBy(xpath="(//a[text()='Dr. D Nageshwar Reddy'])")
	WebElement elementInChairmanPage;
	
	public AigHospitalsPages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveToAboutUs()
	{
		mouseHover(aboutUs);	
	}
	
	public void clickChairmanMessage()
	{
		clickBtn(chairmanMessage);
		waitTime(3000);
	}
	
	public boolean chaimansMessagePage()
	{
		return isElementPresent(elementInChairmanPage);
	}

}
