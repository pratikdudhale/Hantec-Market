package listnerStudy;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenerClass implements ITestListener {
	

@Override
public void onTestStart(ITestResult result) {
	Reporter.log("Test case is started",true);
	ITestListener.super.onTestStart(result);
}

@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case is failed",true);
		ITestListener.super.onTestFailure(result);
	}

@Override
	public void onStart(ITestContext context) {
		Reporter.log("Open test case",true);
		ITestListener.super.onStart(context);
	}
}
