package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	
	
	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		
	}
		
	@Test
	public void login()
	{
		List<WebElement>li=driver.findElements (By.tagName("a"));
		System.out.println("total link size ="+li.size());
		
		
		
		
		
}
}