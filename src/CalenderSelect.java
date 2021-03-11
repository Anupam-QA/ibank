import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.path2usa.com/travel-companions/");
		Thread.sleep(6000);
		
		
		driver.findElement(By.id("travel_date")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().split(" ")[0].trim());
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().split(" ")[0].trim().contains("April"))
		
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
			
		}
		
					
		
		List<WebElement> dates =driver.findElements(By.className("day"));
		
		int count= driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text= driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	}
	

}
