package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {

	
	
	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
		
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("arjun");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("luminar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arjun@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anc2345");
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("anc2345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
}
