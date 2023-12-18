package com.demo.seleniumeasy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class InputFormDemoPage extends SeleniumUtils 
{
	@FindBy(name="first_name")
	WebElement fName;
	@FindBy(name="last_name")
	WebElement lName;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="zip")
	WebElement zip;
	@FindBy(name="website")
	WebElement website;
	@FindBy(name="comment")
	WebElement projDesc;
	@FindBy(xpath="//input[@value='yes']")
	WebElement yesBtn;
	@FindBy(xpath="//button[text()='Send ']")
	WebElement sendBtn;
	
  public InputFormDemoPage() 
  {
	PageFactory.initElements(driver, this);
  }
  public void fillForm(String fNameVal,String lNameVal,String emailVal,String phoneVal,String addressVal,String cityVal,String stateVal,String zipVal,String websiteVal,String projDescVal)
  {
	  enterData(fName,fNameVal);
	  enterData(lName,lNameVal);
	  enterData(email,emailVal);
	  enterData(phone,phoneVal);
	  enterData(address,addressVal);
	  enterData(city,cityVal);
	  selectFromDropDown(state,stateVal);
	  enterData(zip,zipVal);
	  enterData(website,websiteVal);
	  clickBtn(yesBtn);
	  enterData(projDesc,projDescVal);
	  clickBtn(sendBtn);  
  }
}
