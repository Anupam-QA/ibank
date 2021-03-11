import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class moretesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// count no. of link
		System.out.println(driver.findElements(By.tagName("a")).size());
		// count no. of link under footer section by driver subset
		
		WebElement footer =driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// count no. of link under footer section by driver subset and specific column
		
	    WebElement	finalDriver=footer.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]"));
		
		System.out.println(finalDriver.findElements(By.tagName("a")).size());
		
		//click on each link and check if page are openning
		
		driver.manage().deleteAllCookies();
		
		for (int i=1;i<finalDriver.findElements(By.tagName("a")).size();i++)
		{
			String controlkey=Keys.chord(Keys.CONTROL,Keys.ENTER);
			finalDriver.findElements(By.tagName("a")).get(i).sendKeys(controlkey);
			
			
		}
		
		Thread.sleep(3000);
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> it= tabs.iterator();
		
		while(it.hasNext())//whether next index is present or not
			
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}

			

		
		
		
	}


	}


