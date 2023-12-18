package com.demo.seleniumeasy.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.seleniumeasy.qa.pages.BasicCheckboxDemoPage;
import com.utils.qa.SeleniumUtils;

public class BasicCheckboxDemoTest extends SeleniumUtils
{
	BasicCheckboxDemoPage bcdp;
	
	public BasicCheckboxDemoTest()
	{
		super();
	}
	@BeforeClass
	public void initFunc()
	{
		openBrowserAndEnterUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	    bcdp = new BasicCheckboxDemoPage();
	}
	
	@Test
	public void verifyCheckbox()
	{
		for(int indexVal=0;indexVal<bcdp.getOptionsCount();indexVal++)
		{
			  if(indexVal<bcdp.getOptionsCount()-1) {
				Assert.assertEquals(bcdp.readValueOnCheckAllBtn(indexVal).equals("Check All"), true);
		}else if(indexVal==bcdp.getOptionsCount()-1) {
			    Assert.assertEquals(bcdp.readValueOnCheckAllBtn(indexVal).equals("Uncheck All"), true);
		}
		}
	}
	
	@AfterClass
	public void closeTheBrowser()
	{
		closeBrowser();
	}
	
	
}
