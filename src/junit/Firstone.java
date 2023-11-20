package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstone {

	ChromeDriver driver;
	
	@Before
	
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	
	public void test1()
	{
		String act=driver.getTitle();
		System.out.println(act);
	}
	
	@Test
	public void test2()
	{
		
		String src=driver.getPageSource();
		
		if(src.contains("abc"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	
	public void quit()
	{
		driver.quit();
	}
	
}
