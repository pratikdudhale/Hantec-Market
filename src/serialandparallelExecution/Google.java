package serialandparallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


@Test
public class Google {

	public  void google() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("D:\\SELENIUM\\chromedriver.exe");
		Reporter.log("Googlechrome is launching");
		
	}

}
