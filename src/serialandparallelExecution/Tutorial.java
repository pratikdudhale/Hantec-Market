package serialandparallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Tutorial {
	@Test
	public static void tutorialjava() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/testng/testng-parallel-execution/");
		
	}

}
