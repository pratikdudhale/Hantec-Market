package assertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertStudy {
	SoftAssert obj=new SoftAssert();
	@Test
	public void TC1() {
		String m="abc";
		String b="abcd";
		
		
		obj.assertEquals(m, b,"String is not Equal");
	
	Reporter.log("TC1 is running",true);
	obj.assertAll(); 
	 // we have to use assertAll method for implemeting SoftAssert method
	}
	
	@Test
	public void TC2() {
		boolean a=false;
		
		obj.assertFalse(a, "VAlue is True");
		obj.assertAll(); 
		
	}

}
