import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;




public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
					
				
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor Js =(JavascriptExecutor)driver;
		
		Js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(3000);
		Js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement >values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum= 0;
		
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		//System.out.println(sum);
		
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
		//System.out.println(total);
		
		
		
		
		
		}
		

	}

	


