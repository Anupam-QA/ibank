import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Readdata {
	
	WebDriver driver;
	WebDriverWait wait;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;


	public void Read()  throws IOException{

		System.setProperty("webdriver.gecko.driver","D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
		driver.get("http://fgr.smartlearning.com");	
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_UserName")).sendKeys("anupam.sinha@educomp.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Password")).sendKeys("!@#");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login1_Button1")).click();
		
		driver.get("http://fgr.smartlearning.com/erp/erpmaster.aspx");

	driver.manage().window().maximize(); 

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

	// Import excel sheet. 

	File src=new File("D:\\Anupam\\Selenium\\testdata\\ERP-Details.xlsx"); 

	// Load the file. 

	FileInputStream finput = new FileInputStream(src); 

	// Load the workbook. 

	workbook = new HSSFWorkbook(finput); 

	// Load the sheet in which data is stored. 

	sheet= workbook.getSheetAt(0); 

	for(int i=1; i<=sheet.getLastRowNum(); i++) { 

	// Import data for Email. 

	cell = sheet.getRow(i).getCell(1); 

	cell.setCellType(CellType.STRING); 

	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtERPCodeID")).sendKeys(cell.getStringCellValue()); 

	}

}
}
