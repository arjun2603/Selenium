package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else 
		{
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
	}
	
	
	
	
	
}
