package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailScreenshot {
	
	@Test(priority=0)
	public void failureTest() {
		
		Assert.fail("failed login");
		System.out.println("call screenshot");
		
	}

}
