package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exersice {

ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
		
	@Test
	public void login()
	{
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("arjun123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1233456");
		
WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		
		Select daydetails= new Select(day);
		daydetails.selectByValue("2");
		
		
	
WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		
		Select monthdetails= new Select(month);
		monthdetails.selectByValue("10");
		
		
WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		
		Select yeardetails= new Select(year);
		yeardetails.selectByValue("1999");
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("R");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar technolab");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("palakkad");
		
WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select countrydetails= new Select(country);
		countrydetails.selectByValue("Canada");
		
		
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("truento");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("adcdef");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("trgfhudkj");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("6785643256");
		
		
		
				
		
		

	}
	
	
	
	
}
