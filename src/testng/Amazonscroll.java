package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonscroll {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(15000);
	}
	
	@Test
	public void test()
	{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.2000)");
		
		
		
		
		
	}
	
	
	

}
