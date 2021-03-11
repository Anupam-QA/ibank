import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");	
		driver.manage().window().maximize();
		
		WebDriverWait w =new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.blinkingText")));
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.im-para.red")));
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String mailid=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(mailid);
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(mailid);
		
			
		

	}

}
