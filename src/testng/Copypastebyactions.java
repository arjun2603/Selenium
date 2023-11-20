package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypastebyactions {

	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediffid = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("arjun");
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND);
		act.keyDown(fullname,Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND);
		act.keyDown(rediffid,Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND);
		act.perform();
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	}
