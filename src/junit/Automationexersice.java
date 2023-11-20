package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexersice {

	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
		
	@Test
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		Thread.sleep(2);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1233456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1233456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1233456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		
		
	}
	
	
	
@After
	
	public void quit()
	{
		driver.quit();
	}
}
