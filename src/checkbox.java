import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.gecko.driver", "D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("Input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("Input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("Input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("Input[id*='friendsandfamily']")).isSelected());
		
		
		//count the no. of check box
		Assert.assertEquals(driver.findElements(By.cssSelector("Input[type='checkbox']")).size(), 4);
		
		System.out.println(driver.findElements(By.cssSelector("Input[type='checkbox']")).size());
		
		//testNG is testing framework
	}

}
