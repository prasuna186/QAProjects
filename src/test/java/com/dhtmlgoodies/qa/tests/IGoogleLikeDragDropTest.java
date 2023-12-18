package com.dhtmlgoodies.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.seleniumeasy.qa.pages.InputFormDemoPage;
import com.dhtmlgoodies.qa.pages.IGoogleLikeDragDropPages;
import com.utils.qa.SeleniumUtils;

public class IGoogleLikeDragDropTest extends SeleniumUtils
{
	IGoogleLikeDragDropPages gdd;
	
	public IGoogleLikeDragDropTest()
	{
		super();
	}
	
	@BeforeClass
	   public void initFunc()
	   {
		   openBrowserAndEnterUrl("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		   gdd  =new IGoogleLikeDragDropPages();   
	   }
	   @Test
	   public void verifyDragDrop()
	   {
		  gdd.dragBlock3ToBlock2();
		  waitTime(2000);
		  gdd.dragBlock4ToBlock1();
	   }
	   
	   @AfterClass
	   public void closeTheBrowser()
	   {
		 closeBrowser();  
	   }
	   
	}


