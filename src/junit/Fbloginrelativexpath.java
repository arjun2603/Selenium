package junit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbloginrelativexpath {

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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arjun@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("arj345");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	
}
