package propertyDocStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertyUse {
	WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
	}
	
	@Test

public void LOGINTEST(String key) throws IOException {
		
		Properties obj=new Properties();
		FileInputStream DATA=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TestNGg\\property.property");
	obj.load(DATA);
	String value = obj.getProperty( key);
WebElement EnterID = driver.findElement(By.id("userid"));
WebElement Enterpass = driver.findElement(By.id("password"));

	}
	
	
	
}
