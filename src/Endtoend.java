import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
			
		{
			System.out.println("Bye Bye");
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Select s =new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']")));
		s.selectByVisibleText("2");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
