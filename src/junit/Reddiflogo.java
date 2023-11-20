package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiflogo{
	
	
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
		
	@Test
	public void login()
	{
		
		boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)
		{
			System.out.println("yes");
			
		}

		else 
		{
			System.out.println("no");
		}

	}
	
	}
	

