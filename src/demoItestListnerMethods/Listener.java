package demoItestListnerMethods;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener {

@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

    
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}


@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestStart(result);
}

@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

}
