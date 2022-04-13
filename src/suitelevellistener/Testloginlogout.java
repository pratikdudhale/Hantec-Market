package suitelevellistener;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomclassforKITETest.Homepage;
import pomclassforKITETest.PinPage;

public class Testloginlogout extends BaseClass {
	LoginPage P;
	PinPage M;
	Homepage N;
	 
	@BeforeClass
	public void launchbrowser() {
		Reporter.log("launcing browser");
		LAUNCHBROWSER();
		
		 P=new LoginPage(driver);
		  M=new PinPage(driver);
		  N=new Homepage(driver);
	}
	
	@BeforeMethod
	public void LOGIN() throws EncryptedDocumentException, IOException {
		P.EnterID(Utilityclass.getdatafromexel(0, 0));
		P.EnterPass(Utilityclass.getdatafromexel(1,0 ));
		P.clicksubmit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		M.EnterPin(Utilityclass.getdatafromexel(2, 0));
		M.clicksubmit();
		
	}

@Test

public void ValidateID() throws EncryptedDocumentException, IOException {
	
	
	String ActualID = N.ValidateID();
	String ExpectedID = Utilityclass.getdatafromexel(0, 0);
	
	Assert.assertEquals(ActualID, ExpectedID,"ACTUAL IS NOT MATCH WITH EXPECTED");
	
}

@AfterMethod
public void logout() throws InterruptedException {
	
	N.Clicklogout();
}
@AfterClass
public void close() {
	driver.close();
}
}
