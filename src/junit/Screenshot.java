package junit;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
	}
	
	@Test
	public void test() throws Exception
	{
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("./Screenshot/rediff.png"));
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		File src1 =button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File ("./Screenshot/rediff.png"));
		
	}
	
	@After
	
	public void quit()
	{
		driver.quit();
	}

	
	
	
	
	
}
