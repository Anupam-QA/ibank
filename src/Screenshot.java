import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		//cast webdriver to takescreeshot driver
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("D:\\Anupam\\Selenium\\testdata\\screenshot\\test.png"));
		
		

	}

}
