import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class mozilaErpSearch {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://fgr.smartlearning.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Login1_UserName\"]")).sendKeys("anupam.sinha@educomp.com");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Login1_Password\"]")).sendKeys("!@#");
		//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Login1_Button1\"]")).click();
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_Login1_Button1")).click();
		
		driver.get("http://fgr.smartlearning.com/ERP/ERPMaster.aspx");
		//
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtERPCodeID\"]")).sendKeys("TEHW002922");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnGetSearchData\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String Fdate =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtERPFirstLicenseDate\"]")).getAttribute("value");
		String Ldate =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLastLicenseDate\"]")).getAttribute("value");
		

		
	    System.out.println("First License date is: "+Fdate);
	    System.out.println("Last License date is: "+Ldate);
	    
	    
	}

}
