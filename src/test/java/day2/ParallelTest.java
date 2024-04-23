package day2;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	@Parameters({"browsers"})
	@Test
	public void parallelTest(String b) throws InterruptedException
	{
		Date d=new Date();
		System.out.println("parallelTest"+b+"  "+d);
		Thread.sleep(2000);
	}

}
