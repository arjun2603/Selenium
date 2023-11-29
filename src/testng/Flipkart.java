package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		
		
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.flipkart.com");
	}

	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
