package suitelevellistener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends BaseClass implements ITestListener {
	BaseClass m= new BaseClass();
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test case fail please try again " +result.getTestName(),true);
		ITestListener.super.onTestFailure(result);
	
	String TCName = result.getName();
	
	try {
		m.getscreenshot(TCName);
		
	}
	catch(IOException r) {
		
		r.printStackTrace();
	}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
}
}
