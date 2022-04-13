package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
  @Test(timeOut=2000)    //timeout if case is not comple within time then it will fail nd other will execute
  public void test1() throws InterruptedException {
	  Reporter.log("TEst case 1 is passed",true);
	  Thread.sleep(2000);
  }
  @Test(priority=-1,invocationCount=2)
  public void test2() {
	  Reporter.log("TEst case 2 is passed",true);
  }
  @Test(enabled=false)
  public void test3() {
	  Reporter.log("TEst case 3 is passed",true);
  }
  @Test
  public void test4() {
	  Reporter.log("TEst case 4 is passed",true);
  }
}
