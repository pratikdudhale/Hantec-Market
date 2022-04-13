package assertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertMethodStudy {

	
	@Test
	public  void TC1() {
	
		String actualResult="abcd";
		String Expectedresult="abcde";
		
		Assert.assertEquals(actualResult, Expectedresult,"String is not match");
	Assert.assertNotEquals(actualResult, Expectedresult,"string is same");
		Reporter.log("TC1 is pass", true);
		
	}
	@Test
	public void TC2() {
		String M="dnyansai";
		String N="dnyansai";
		
		Assert.assertNotEquals(M, N, "string is match");
	}
	@Test()
	public void TC3() {
	
//		boolean output= Title.isSelected();
//		boolean output=T.isMultiple();
	
	
	boolean Result = false;
	
	Assert.assertTrue(Result, "Value is false");
	
	
	
	}
@Test
public void TC4() {
	boolean m = false;
	
	//Assert.assertFalse(m, "Value is True");
	Assert.fail();
}

@Test
public void Tc5() {
	String m=null;
	
	Assert.assertNull(m, "String is not Null");
	Reporter.log("TC5 is PASSED");
}

@Test(dependsOnMethods="TC2")
public void TC6() {
	Reporter.log("TC6 IS RUNNING",true);
	
}
}
