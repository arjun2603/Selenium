package testng;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String window = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		
		Set <String> allWindowHandles = driver.getWindowHandles();
		
		for (String Handle : allWindowHandles)
		{
			if(!Handle.equalsIgnoreCase(window))
			{
				driver.switchTo().window(Handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
				driver.close();
				
				
			}
		}
				
			
				
		
		
	}
	
}
