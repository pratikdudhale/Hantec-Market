package pomclassforKITETest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CBTesting {

	

		LoginPage login ;
		Sheet Mysheet;
		 PinPage pin;
		 Homepage home;
		WebDriver driver;
		
		@Parameters("browserName")
		@BeforeClass
		public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException {
			
			if(browser.equals("chrome")) {
							
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("---------disable---notification-----");
			driver=new ChromeDriver(opt);
			}
			else if(browser.equals("firefox")) {
				Reporter.log("Launching Firefox driver", true);
			
				System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");
			
				FirefoxOptions obj=new FirefoxOptions();
				driver=new FirefoxDriver(obj);
				obj.addArguments("---disable-notifications-------");
			}
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.manage().window().maximize();
			
			
		Reporter.log("Browser Launch Successfully",true);	
			FileInputStream file=new FileInputStream("D:\\SELENIUM\\Book1.xlsx");
			
		Mysheet = WorkbookFactory.create(file).getSheet("Sheet3");
	 login = new LoginPage(driver);
	 pin=new PinPage(driver);
	  home=new Homepage(driver);
	  
		}
		
		@BeforeMethod
		public void logintoKite() {
			String userid = Mysheet.getRow(0).getCell(0).getStringCellValue();
			String passward = Mysheet.getRow(0).getCell(1).getStringCellValue();
	  String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
	  Reporter.log("Enter UserID and Passward", true);
	  
	  login.EnterID(userid);
	  login.EnterPass(passward);
	  login.clicksubmit();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("Please Enter PIN", true);
	  pin.EnterPin(PIN);
	  pin.clicksubmit();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
		
		}
		
		@Test
		public void ValidateuserID() {
			
			Reporter.log("Validating USERID", true);
			
			String ExpectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
			
			String ActualUserID = home.ValidateID();
			
			Assert.assertEquals(ExpectedUserID, ActualUserID,"Actual Id is Not Equal To Expected Id");
		}
		
		@AfterMethod
		public void logout() throws InterruptedException {
			Reporter.log("Logging OUT", true);
			home.Clicklogout();
			
			
			
		}

		@AfterClass
		public void CloseBrowser()
		{
			Reporter.log("Closing Browser");
		driver.close();
	}
	}



