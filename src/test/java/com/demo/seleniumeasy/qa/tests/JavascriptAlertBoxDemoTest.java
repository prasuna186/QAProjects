package com.demo.seleniumeasy.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.seleniumeasy.qa.pages.InputFormDemoPage;
import com.demo.seleniumeasy.qa.pages.JavascriptAlertBoxDemoPage;
import com.utils.qa.SeleniumUtils;

public class JavascriptAlertBoxDemoTest extends SeleniumUtils
{
	JavascriptAlertBoxDemoPage  jabd;

public JavascriptAlertBoxDemoTest()
{
	super();
}

@BeforeClass
public void initFunc()
{
	   openBrowserAndEnterUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	   jabd  =new JavascriptAlertBoxDemoPage();   
}
@Test
public void verifyAlertBox()
{
	jabd.clickOnPromptBox();
	enterDataToAlert("Selenium");
	waitTime(2000);
	clickOkOnAlert();
	waitTime(2000);
	Assert.assertEquals(jabd.outputMsg().contains("Selenium"), true);
}

@AfterClass
public void closeTheBrowser()
{
	 closeBrowser();  
}

}


