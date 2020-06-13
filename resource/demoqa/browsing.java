package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsing 
{
	public static WebDriver driver;
	public static WebDriver browser(String a)
	{
	if(a.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();	
	}
	if(a.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();	
	}
	else
	{
	System.out.println("No Browser Present");	
	}
	driver.get("http://www.demoqa.com/");		
	return driver;
	}

}
