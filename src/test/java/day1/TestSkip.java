package day1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip()
	{
	throw new SkipException("skipped");
		
		
	}

}
