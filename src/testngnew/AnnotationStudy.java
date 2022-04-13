package testngnew;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
 
	@Test   (invocationCount=3)         //method will run 3 times
  
  
  public void Method1() {
	  Reporter.log("Method 1  is running",true);
  }
  @BeforeClass
  public void Method2() {
	  Reporter.log(" before class   is running",true);
  }
  
  @AfterClass
  public void Method3() {
	  Reporter.log("after class   is running",true);
  }
  @BeforeMethod
  public void Method4() {
	  Reporter.log("before Method  is running",true);
  }
  @AfterMethod
  public void Method5() {
	  Reporter.log("after Method 5 is running",true);
  }
}
