package testng;

import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Rightclickdouble {

	
	
	
		ChromeDriver driver;
		
		
		
		@BeforeTest
		public void setUp()
		{
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.htm1");
		
		}
		@Testable
		public void test()
		{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver); act.contextClick(right).perform();
		driver.findElement (By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
	
		WebElement doubleclickelement=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclickelement).perform();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a. accept();
	
	
	
}}
