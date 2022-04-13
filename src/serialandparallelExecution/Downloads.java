package serialandparallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Downloads {
	@Test
	public  void Download() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("chrome://downloads/");
		Reporter.log("Download is opeing");
		
		
	}

}
