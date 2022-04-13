package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test
  public void f() {
	 Reporter.log("1 is Running", true);
  
  }
  
  @Test(invocationCount=5)
  public void f2() {
	 Reporter.log("2 is Running", true);
  }
  @Test
  public void f3() {
	 Reporter.log("3 is Running", true);
  }

}

