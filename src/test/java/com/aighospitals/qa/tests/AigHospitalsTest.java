package com.aighospitals.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aighospitals.qa.pages.AigHospitalsPages;
import com.demo.seleniumeasy.qa.pages.BasicCheckboxDemoPage;
import com.utils.qa.SeleniumUtils;

public class AigHospitalsTest extends SeleniumUtils
{
	AigHospitalsPages AigHomes;
	
	public AigHospitalsTest()
	{
		super();
	}
	@BeforeClass
	public void initFunc()
	{
		openBrowserAndEnterUrl("https://www.aighospitals.com/");
		waitTime(3000);
		AigHomes = new AigHospitalsPages();
	}
	
	@Test
	public void verifyMouseHover()
	{
      AigHomes.moveToAboutUs();
      AigHomes.clickChairmanMessage();
      Assert.assertEquals(AigHomes.chaimansMessagePage(), true);
	}
	
	@AfterClass
	public void closeTheBrowser()
	{
		closeBrowser();
	}
	
}
