import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Anupam\\Selenium\\software\\chromedriver_win32\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://fgr.smartlearning.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_UserName")).sendKeys("anupam.sinha@educomp.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Password")).sendKeys("123");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Button1")).click();
		System.out.println(driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtError")));
		driver.close();
		
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		//*[@id="ctl00_ContentPlaceHolder1_Login1_UserName"]
		//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Login1_UserName\"]")).sendKeys("anupam");
		//driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_Login1_UserName")).sendKeys("HIAnupam");

	
	}

}
