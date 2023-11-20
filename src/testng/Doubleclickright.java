package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclickright {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.htm1");
	
	}
	@Test
	public void test()
	{
	WebElement right=driver.findElement (By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver); 
	act.contextClick(right).perform();
	
	driver.findElement (By.xpath("//*[@id=\"authentication\"]/ul/li[1]")) .click();
	
	}
	
	
	
	
	
	
}
