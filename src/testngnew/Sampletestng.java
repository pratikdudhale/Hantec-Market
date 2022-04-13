package testngnew;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class Sampletestng {
	
		public void demo() {
			System.out.println("MAYUR");
			Reporter.log("plasse check spelling",true);
		}
		@Test(priority=-1,timeOut=2000)
public void test2() {
	System.out.println("Test 2 open");
}
	}


