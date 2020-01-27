package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGListenerDemo2 {
	@Test
	public void test4()
	{
		System.out.println("I am in test 4");
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@Test
	public void test5()
	{
		System.out.println("I am in test 5");
	}
	@Test
	public void test6()
	{
		System.out.println("I am in test 6");
	}
}
