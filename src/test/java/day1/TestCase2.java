package day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void HardAssertion()
	{
		String expected="yahoo";
		String actual="gmail";
		System.out.println("first step hard assert");
		//Assert.assertEquals(actual, expected);
		Assert.fail("condtion failed");
		System.out.println("final step hard assert");
		
	}

	@Test
	public void SoftAssertion()
	{
		String expected="yahoo";
		String actual="gmail";
		SoftAssert sf= new SoftAssert();
		//Assert.assertEquals(actual, expected);
		sf.assertEquals(false, true);
		System.out.println("finalstep");
		sf.assertAll();
		
	}


}
