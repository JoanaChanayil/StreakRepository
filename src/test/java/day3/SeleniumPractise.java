package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractise {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[contains(text(),'Elements')]")).click();
		
		
		//checkBox(wait);
		raidio(wait);
		
	}
	public static void textBox() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
		
		WebElement textbox=driver.findElement(By.xpath("//a[contains(text(),'Text Box')]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Text Box')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Text Box')]")).click();
		
		driver.findElement(By.id("fullname")).sendKeys("joana");
		driver.findElement(By.id("email")).sendKeys("asd@gmail.com");
		driver.findElement(By.id("address")).sendKeys("652 hiightl\r\n"
				+ "markham\r\n"
				+ "682041");
		driver.findElement(By.id("password")).sendKeys("salkddsg");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	public static void checkBox(WebDriverWait wait)
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Check Box')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Check Box')]")).click();
		driver.findElement(By.id("c_bs_1")).click();
		
				}
	
	public static void raidio(WebDriverWait wait)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Radio Button')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Radio Button')]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	}

}
