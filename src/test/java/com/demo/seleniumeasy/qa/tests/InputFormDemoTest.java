package com.demo.seleniumeasy.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.seleniumeasy.qa.pages.InputFormDemoPage;
import com.utils.qa.SeleniumUtils;

public class InputFormDemoTest  extends SeleniumUtils
{
   InputFormDemoPage ifdp;
   public InputFormDemoTest()
   {
	   super();   
   }
   
   @BeforeClass
   public void initFunc()
   {
	   openBrowserAndEnterUrl("https://demo.seleniumeasy.com/input-form-demo.html");
	   ifdp  =new InputFormDemoPage();   
   }
   @Test
   public void verifyFormFill()
   {
	   ifdp.fillForm("aaa", "bbb", "a.b@gmail.com", "9876543210", "Hyderbad", "Hyderbad", "Alaska", "50000", "www.insta.com", "This is my Project");
   }
   
   @AfterClass
   public void closeTheBrowser()
   {
	 closeBrowser();  
   }
   
}
