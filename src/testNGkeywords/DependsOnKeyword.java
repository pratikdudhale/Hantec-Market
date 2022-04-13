package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class DependsOnKeyword {
	

  @Test(priority = 1,dependsOnMethods="Logout")
	public void Login()
	  {
		Reporter.log("Login sucess",true);
		
	  }
	
	@Test(priority = 2,enabled=true)
	public void VerifyPin()
	{
	Reporter.log("Pin Verified",true);
	}
	
	@Test (dependsOnMethods = "VerifyPin")
		public void Logout()
	{
		Reporter.log("Logout success", true);
	}




  }

