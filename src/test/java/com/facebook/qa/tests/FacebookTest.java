package com.facebook.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.qa.pages.FacebookPage;
import com.utils.qa.SeleniumUtils;

public class FacebookTest extends SeleniumUtils
{
   FacebookPage fbp;
   public FacebookTest()
   {
	   super();
   }
   @BeforeClass
   public void initFunc()
   {
	   openBrowserAndEnterUrl("https://www.facebook.com/");
	   fbp = new FacebookPage();
   }
   
   @Test
   public void verifyFormFill()
   {
	   fbp.fillForm("aaa", "bbb", "a.b@gmail.com","abcdef", "Jan", "9", "2009");
   }
   
   @AfterClass
   public void closeTheBrowser()
   {
	   closeBrowser();
   }
}
