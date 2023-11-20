package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonverify {

	
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
		boolean radio =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).isSelected();
		
		if(radio)
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
