package day1Reggresion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeMethod
	public void oBrowser()
	{
		System.out.println("o Browser");
	}
		
	@AfterMethod
	public void cBrowser()
	{
		System.out.println("c Browser");
	}
@BeforeMethod
public void openBrowser()
{
	System.out.println("open Browser");
}
	
@AfterMethod
public void closeBrowser()
{
	System.out.println("close Browser");
}

@BeforeTest
public void openDB()
{
	System.out.println("openDB connection");
}
@AfterTest
public void closeDB()
{
	System.out.println("closeDB connection");
}
@Test(priority=1)
public void doLogin()
{
	System.out.println("Login");
}
@Test
public void doRegistration()
{
	System.out.println("Regstration");
}

}

