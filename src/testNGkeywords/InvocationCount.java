package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
 @BeforeMethod
  public void loginid() {
	  Reporter.log("Type Valid ID",true);
  }
 @Test(invocationCount=4)
 public void pass() {
	 Reporter.log("Type valid pass",true);
 }
 
 @AfterMethod
 public void submit() {
	 Reporter.log("click submit", true);
 }
}
