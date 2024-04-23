package day2;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(dataProvider = "getData",invocationCount = 5)
	public void parallelTest(String b) throws InterruptedException
	{
		Date d=new Date();
		System.out.println("parallelTest"+b+"  "+d);
		Thread.sleep(2000);
	}
	@DataProvider
	public Object[][] getData()
	
	{
		Object[][] d= new Object[2][1];
		d[0][0]="firefox";
		d[1][0]="chrome";
		return d;
	}
		

}
