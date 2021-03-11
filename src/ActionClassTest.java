import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		String s="yashika";
		WebElement txt= driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		a.moveToElement(txt).click().keyDown(Keys.SHIFT).sendKeys(s).build().perform();
		a.moveToElement(txt).click().doubleClick();
		
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		

	}

}
