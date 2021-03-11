import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErpSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Anupam\\Selenium\\software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://fgr.smartlearning.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_UserName")).sendKeys("anupam.sinha@educomp.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Password")).sendKeys("!@#");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Button1")).click();
		driver.get("http://fgr.smartlearning.com/ERP/ERPMaster.aspx");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtERPCodeID")).sendKeys("TEHW002922");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Btn_NewERP")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceHolder1_txtParentERP\']")).sendKeys("esch00001");
	
	    

		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDMNO")).sendKeys("9999999999");
	}
}