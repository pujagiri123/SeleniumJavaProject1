package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest()
	{
		//String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "P:\\selenium jars\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void googleSearch()
	{
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	@AfterTest
	public void testTearDown()
	{
		//driver.close();
	//	driver.quit();
		System.out.println("Test completed succesfully.");
	}
}
