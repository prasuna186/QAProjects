package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class FacebookPage extends SeleniumUtils
{
  @FindBy(xpath="//a[text()='Create new account']")
  WebElement createNewAccountBtn;
  @FindBy(name="firstname")
  WebElement fName;
  @FindBy(name="lastname")
  WebElement lName;
  @FindBy(name="reg_email__")
  WebElement email;
  @FindBy(name="reg_passwd__")
  WebElement password;
  @FindBy(name="birthday_month")
  WebElement month;
  @FindBy(name="birthday_day")
  WebElement day;
  @FindBy(name="birthday_year")
  WebElement year;
  @FindBy(xpath="//input[@value='1']")
  WebElement femaleBtn; 
  @FindBy(xpath="//button[text()='Sign Up']")
  WebElement signUpBtn;
  
  
  public FacebookPage()
  {
	  PageFactory.initElements(driver, this);
  }
  public void fillForm(String fNameVal,String lNameVal,String emailVal,String passwordVal,String monthVal,String dayVal,String yearVal)
  {
	  clickBtn(createNewAccountBtn);
	  enterData(fName,fNameVal);
	  enterData(lName,lNameVal);
	  enterData(email,emailVal);
	  enterData(password,passwordVal);
	  selectFromDropDown(month,monthVal);
	  selectFromDropDown(day,dayVal);
	  selectFromDropDown(year,yearVal);
	  clickBtn(femaleBtn);
	  clickBtn(signUpBtn);  
  }
}
