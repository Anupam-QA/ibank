import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElement(By.id("divpaxinfo")).click();

		Select s = new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']")));
		s.selectByVisibleText("2");

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"view-destination-station\"]")).getText());

	}

}
