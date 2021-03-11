import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "D:\\Anupam\\Selenium\\software\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"));
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
	{
		System.out.println("Hello");
		Assert.assertTrue(true);
	}
	else
		
	{
		System.out.println("Bye Bye");
	}
	}
	
	}
	
		
		
		//driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		


	



