package suitelevellistener;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {
	WebDriver driver;
	public void LAUNCHBROWSER() {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		driver =new ChromeDriver(obj);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		driver.manage().window().maximize();
	}
	public  void getscreenshot(  String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SELENIUM\\Screenshot\\defect"+TCName+".png");
		FileHandler.copy(src, dest);
	}
	}


