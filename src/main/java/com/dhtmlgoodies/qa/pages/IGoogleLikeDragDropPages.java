package com.dhtmlgoodies.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class IGoogleLikeDragDropPages extends SeleniumUtils
{
   @FindBy(xpath="//h1[text()='Block 1']")
   WebElement block1;
   
   @FindBy(xpath="//h1[text()='Block 2']")
   WebElement block2;

   @FindBy(xpath="//h1[text()='Block 3']")
   WebElement block3;

   @FindBy(xpath="//h1[text()='Block 4']")
   WebElement block4;
   
   public IGoogleLikeDragDropPages()
   {
	   PageFactory.initElements(driver, this);
   }
   public void dragBlock3ToBlock2()
   {
	  dragDrop(block3,block2);
   }
   
   public void dragBlock4ToBlock1()
   {
	  dragDrop(block4,block1);
   }
}
