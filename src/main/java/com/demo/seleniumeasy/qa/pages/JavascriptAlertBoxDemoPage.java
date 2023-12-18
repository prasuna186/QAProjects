package com.demo.seleniumeasy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.qa.SeleniumUtils;

public class JavascriptAlertBoxDemoPage extends SeleniumUtils
{
    @FindBy(xpath="//button[text()='Click for Prompt Box']")
    WebElement clickForPromptBoxBtn;
    
    @FindBy(id="prompt-demo")
    WebElement outputMsg;
    
    public JavascriptAlertBoxDemoPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnPromptBox()
    {
    	clickBtn(clickForPromptBoxBtn);
    }
    
    public String outputMsg()
    {
    	return readText(outputMsg);
    }
    
    
}
