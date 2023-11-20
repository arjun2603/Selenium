package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcreatebutton {

	
	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
	}
	
	@Test
	public void test()
	{
	String buttontext =driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	
		
		if(buttontext.equals("Create my account >>"))
			
		{
			System.out.println("yes");
		}
		
		else 
		{
			System.out.println("no");
		}
	}
	
	@After
	
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
	
}
