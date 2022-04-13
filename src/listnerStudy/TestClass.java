package listnerStudy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;



@Listeners(listnerStudy.ListenerClass.class)

public class TestClass {
	
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		
	}
	@Test
	public void TC2() {
		
		Reporter.log("TC2 is runninng",true);
	}
	@Test
	public void TC3() {
		Assert.fail();
		Reporter.log("TC3 is running",true);
		
	
	}
	@Test(dependsOnMethods={"TC3"})
	public void TC4() {
		Reporter.log("TC4 is running", true);
		
	}

}
