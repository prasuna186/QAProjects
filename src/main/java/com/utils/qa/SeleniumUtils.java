package com.utils.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.testmain.qa.TestMain;

public class SeleniumUtils extends TestMain
{

	public void enterData(WebElement eleToEnter,String valueToEnter)
	{
		eleToEnter.sendKeys(valueToEnter);
	}
	public void selectFromDropDown(WebElement dropToSelectFrom,String whatValueToSelect)
	{
		Select val = new Select(dropToSelectFrom);
		val.selectByVisibleText(whatValueToSelect);
	}
	public void clickBtn(WebElement buttonToClickOn)
	{
		buttonToClickOn.click();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public String readText(WebElement readFromEle)
	{
		return readFromEle.getText();
	}
	
	public String readTextOnBtn(WebElement btnToReadTheText)
	{
		return btnToReadTheText.getAttribute("value");
		
	}
	
	public void dragDrop(WebElement from,WebElement to)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to);
		act.perform();
	}
	
	public void waitTime(int timeInMilliSecons)
	{
		try {
			Thread.sleep(timeInMilliSecons);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void mouseHover(WebElement eleToMoveTheMouse)
		{
			Actions act=new Actions(driver);
			act.moveToElement(eleToMoveTheMouse);
		}
		
		public boolean isElementPresent(WebElement elePresent)
		{
			return elePresent.isDisplayed();
		}
	

		public void enterDataToAlert(String dataToEnter)
	{
		driver.switchTo().alert().sendKeys(dataToEnter);
	}
		
		public void clickOkOnAlert()
		{
			driver.switchTo().alert().accept();
		}
}


