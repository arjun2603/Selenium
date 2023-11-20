package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdownmenu {

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
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		
		Select daydetails= new Select(day);
		daydetails.selectByValue("02");
		List <WebElement> dayy=daydetails.getOptions();
		System.out.println(dayy.size());
		
	
WebElement day1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		
		Select monthdetails= new Select(day1);
		monthdetails.selectByValue("10");
		List <WebElement> month=monthdetails.getOptions();
		System.out.println(month.size());
		
WebElement day2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		
		Select yeardetails= new Select(day2);
		yeardetails.selectByValue("1999");
		List <WebElement> year=yeardetails.getOptions();
		System.out.println(year.size());
	
	
	
}}
