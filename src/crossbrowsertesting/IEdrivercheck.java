package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdrivercheck {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.ie.driver", "D:\\SELENIUM\\IEDriverServer.exe")	;

	WebDriver driver= new InternetExplorerDriver();
	
	driver.get("https://www.facebook.com/events/1610111309388306");
	System.out.println("vhjjv");

	}

}
