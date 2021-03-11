import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
			
		String[] VegReq = { "Cucumber", "Brocolli", "Beetroot" };
		
				
		int j = 0;
		Thread.sleep(3000);

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
	

		for (int i = 0; i < product.size(); i++)

		{
			// split text

			String[] name = product.get(i).getText().split("-");

			// get required text using index no.

			String finalVegName = name[0].trim();

			// convert array to array list( array take less memory then array list)

			List AddToCartItems = Arrays.asList(VegReq);

			// check items

			if (AddToCartItems.contains(finalVegName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == VegReq.length)

				{

					break;

				}

			}
		}
		WebDriverWait w = new WebDriverWait(driver,5);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promobtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")));
		s.selectByValue("India");
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	}



}
