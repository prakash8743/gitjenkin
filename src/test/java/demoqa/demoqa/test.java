package demoqa.demoqa;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demoqa.browsing;



public class test extends browsing
{
	static browsing brow;
	location loc;
	@BeforeClass
	public void preconditions()
	{
	brow.browser("firefox");	
	}
	@Test(priority=1,groups={"text"})
	public void conditions()
	{
	brow.browser("firefox");
	driver.manage().window().maximize();
	location loc=new location();	
	loc.getElement().click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loc.getTextbox().click();
	loc.getFullname().sendKeys("Prakash");
	loc.getEmail().sendKeys("prakashfrenz@gmail.com");
	loc.getCurrentaddress().sendKeys("1467,Garden Avenue,Mogappair,Chennai-37.");
	loc.getCurrentaddress1().sendKeys("1467,Garden Avenue,Mogappair,Chennai-37.");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Actions action =new Actions(driver);
	//action.moveToElement(loc.getSubmit()).click();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",loc.getSubmit());
	}
	@Test(priority=2,groups={"Check"})
	public void conditions1()
	{
	brow.browser("firefox");
	loc=new location();	
	loc.getElement().click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loc.getCheckbox().click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	loc.getExpand().click();
	loc.getDesktop1().click();
	loc.getDesktopcmd().click();
	loc.getDocuments().click();
	loc.getWorkspace().click();
	driver.findElement(By.xpath("//*[text()='Angular']")).click();
	driver.findElement(By.xpath("//*[text()='Veu']")).click();
	}
	@Test(priority=3,groups={"Radio"})
	public void conditions2()
	{
	brow.browser("firefox");
	loc=new location();
	loc.getElement().click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loc.getRadiobutton().click();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",loc.getRadio());
//	loc.getRadio().click();
	}
	@Test(priority=4,groups={"tables"})
	public void conditions3()
	{
	loc=new location();
	loc.getTable().click();
	List<WebElement> table=driver.findElements(By.xpath("//div[@id='app']/div/div/div[2]/div[2]"));
	for (WebElement webElement : table) 
	{
	System.out.println(webElement.getText());	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement Gentry=driver.findElement(By.xpath("//div[@class='rt-tr -odd']//div[text()='Gentry']"));
	System.out.println("Name:"+Gentry.getText());
	System.out.println(webElement.getTagName());
	Iterator<WebElement> it=table.iterator();
	while(it.hasNext())
	{
	System.out.println("Iterator"+it.next());	
	}
	}
	}
	@Test(priority=5,groups={"upload"})
	public void conditions4()
	{
	loc=new location();
	JavascriptExecutor exe=(JavascriptExecutor)driver;
	exe.executeScript("arguments[0].click();",loc.getUpload());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loc.getChoosefile().sendKeys("C:\\Users\\Prakash Alagappan\\Desktop\\Prakash\\College Resume.doc");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loc.getDownload().click();
	}
	/*List<WebElement> allRows = table.findElements(By.tagName("tr"));
	// And iterate over them, getting the cells
		for (WebElement row : allRows) {
		List<WebElement> cells = row.findElements(By.tagName("td"));
		for (WebElement cell : cells) {
		System.out.println("content >>   " + cell.getText());
		}
	}*/
	
}

