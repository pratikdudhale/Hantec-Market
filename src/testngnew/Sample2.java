package testngnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
  
	@Test(dependsOnMethods="demo3")
 
  public void demo2() {
Reporter.log("HI Good Mornong open Seleniium",true);
System.out.println("new changes");
}
	@Test
	 
	  public void demo3() {
	Reporter.log("click ",true);

	}
	@Test
	 
	  public void demo4() {
	Reporter.log("opn ",true);

	}
}