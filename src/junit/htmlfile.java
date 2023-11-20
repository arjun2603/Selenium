package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlfile {

	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///Users/arjun/Documents/untitled%20text%202.html");
		
	}
		
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alert =a.getText();
		System.out.println(alert);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("arjun");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("r");
		
		
	
	
	
	
	}	
	
}
