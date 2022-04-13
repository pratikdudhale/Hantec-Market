package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {
	@Test (priority=-21)
	public void C()
	{
		Reporter.log("C is running",true);
	  }
	
@Test (invocationCount=2,priority= 3)  //based on priority method sequence will change
public void A()
  {
	Reporter.log("A is running",true);
  }
@Test(priority=2)
public void B() 
  {
	Reporter.log("B is running",true);
  }


}
