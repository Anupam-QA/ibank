import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// use java method to get status code.xhr 
		
		// get all url with link
		//>400 code
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> Flinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a =new SoftAssert();
		
		for(WebElement link : Flinks)
		{
				
		
			
		String url= link.getAttribute("href");
		
		HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		int Rcode=conn.getResponseCode();
		System.out.println(Rcode);
		a.assertTrue(Rcode<400,"The Link with text  " +link.getText()+" having response code  " +Rcode);
		
					
		}
		a.assertAll();

	}

}
