package day1customListerners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listerners implements ITestListener{

	 public void onTestFailure(ITestResult result) {
		 
		 Reporter.log("screenshot link");
		 System.out.println("capture screenshot on failed test"+result.getName() );
		  }

	  public void onTestSuccess(ITestResult result) {

			 System.out.println("sucess test"+result.getName() );

	  
	  }
}
