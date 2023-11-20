package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {
	

	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://ww.facebook.com");
		
	}
		
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("arjun@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("arj345");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	
	public void quit()
	{
		driver.quit();
	}
}

