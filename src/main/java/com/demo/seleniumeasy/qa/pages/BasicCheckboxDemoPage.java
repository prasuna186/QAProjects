package com.demo.seleniumeasy.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class BasicCheckboxDemoPage extends SeleniumUtils
{
	@FindBy(className="cb1-element")
	List<WebElement>options;
	
	@FindBy(id="check1")
    WebElement checkAllBtn;
	
	public BasicCheckboxDemoPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public int getOptionsCount()
	{
		return options.size();
	}
	
	public String readValueOnCheckAllBtn(int indexVal)
	{
		clickBtn(options.get(indexVal));
		return readTextOnBtn(checkAllBtn);
		
		
	}
	
	
}
