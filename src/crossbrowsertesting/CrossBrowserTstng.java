package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTstng {
	
	@Parameters("browsername")
	@Test
	
	public void crossBrowser(String browsername) throws InterruptedException {
		
		WebDriver driver= null;
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			
			System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
	
			
		 driver.get("https://vctcpune.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
			
			
			
		}

	
	}


