import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> EList =driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList=EList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> SortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(SortedList));
		List<String> price;
		
		do 
		{
		List<WebElement> EList2 =driver.findElements(By.xpath("//tr/td[1]"));
		
		price=EList2.stream().filter(s->s.getText().contains("Rice")).map(s->GetvegPrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);

	}

	private static String GetvegPrice(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
	
		
		return pricevalue;
	}

}
