package com.testmain.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestMain
{
  public static WebDriver driver;
  public static Properties prop;
  
  public TestMain()
  {
	  try {
	  prop = new Properties();
		FileInputStream readData = new FileInputStream("C:\\Users\\ckuma\\eclipse-workspace\\QAProjects\\src\\main\\java\\com\\config\\qa\\config.properties");
			prop.load(readData);
		} 
	  catch (FileNotFoundException e)
	       {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	  catch (IOException e) 
	  {
		e.printStackTrace();
	  }
  }
  
	public void openBrowserAndEnterUrl(String url)
	{
		String browserType=prop.getProperty("browser");
		if(browserType.equalsIgnoreCase("firefox"))
		    {
			driver= new FirefoxDriver();
			}else if(browserType.equalsIgnoreCase("chrome")) 
			{
			driver = new ChromeDriver();
		    }else if(browserType.equalsIgnoreCase("safari"))
		    {
		    driver = new SafariDriver();
		    }else
		    {
		    	System.out.println("Please enter the valid browser type");
		    }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
  
  
}
