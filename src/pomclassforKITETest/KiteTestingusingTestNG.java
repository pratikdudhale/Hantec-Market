package pomclassforKITETest;

import org.openqa.selenium.WebDriver;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class KiteTestingusingTestNG<ChromeOptions> {
	
	WebDriver driver;
//	String uid;
//	String pass;
//	String pin;
	
	
	@BeforeClass
	public void LaunchBrowser() {
		Reporter.log("Browser is Launching");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
//ChromeOptions opt = new ChromeOptions();	

	}

}
