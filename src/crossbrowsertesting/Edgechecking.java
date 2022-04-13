package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Edgechecking {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.guru99.com/cross-browser-testing-using-selenium.html");
		System.out.println("Driver is runnning");
	}

}
