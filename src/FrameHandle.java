import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Anupam\\Selenium\\software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");	
		//driver.findElement(By.id("draggable")).click();
		System.out.println(driver.findElements(By.cssSelector("iframe")).size());
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		WebElement Drag =driver.findElement(By.id("draggable"));
		WebElement Drop =driver.findElement(By.id("droppable"));
		Actions a =new Actions(driver);
		a.dragAndDrop(Drag, Drop).build().perform();
		driver.switchTo().defaultContent();

	}

}
