package testngnew;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuiteStudy {
	@Test  
	  
	  
	  public void Method1() {
		  Reporter.log("Method 1  is running",true);
	  }
	  @Test
	  public void Method2() {
		  Reporter.log(" Method 2  is running",true);
	  }
	  
	  @Test
	  public void Method3() {
		  Reporter.log("Method 3  is running",true);
	  }
	  @Test
	  public void Method4() {
		  Reporter.log("Method 4  is running",true);
	  }
	  @Test
	  public void Method5() {
		  Reporter.log("Method 5  is running",true);
	  }
	}
