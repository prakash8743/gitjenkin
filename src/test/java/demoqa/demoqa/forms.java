package demoqa.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demoqa.browsing;

public class forms extends browsing
{
static browsing brow;
location loc;
@BeforeClass
public void preconditions()
{
brow.browser("firefox");	
}
@Test(priority=5,groups={"text"})
public void conditions()
{
brow.browser("firefox");
driver.manage().window().maximize();
location loc=new location();	
loc.getElement().click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",loc.getForm());
}
@AfterClass
public void postconditions()
{

}
}

