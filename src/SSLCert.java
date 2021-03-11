import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions s =new ChromeOptions();
		DesiredCapabilities chr =new DesiredCapabilities();
		chr.acceptInsecureCerts();
		chr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		chr.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		s.merge(chr);
		System.setProperty("webdriver.chrome.driver", "D:\\Anupam\\Selenium\\Project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(s);

	}

}
