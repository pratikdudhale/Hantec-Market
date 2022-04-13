package testngnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleBrowser {
  @Test
  public void Method1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test
  public void method2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Reporter.log("method2 is running",true);
	  driver.close();
	  
  }
 @Test
  public void method0() throws InterruptedException {
	
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("headless");            //use for only run script and result shown browser will not open, browser is hide
	 WebDriver driver= new ChromeDriver(opt);// pass parameter as chromeoption
	  
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  System.out.println("Method 3 is running");
	  driver.close();
	  
  }
  
  

  
}
