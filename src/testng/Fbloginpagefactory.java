package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpagefactory {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpass;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	
	public Fbloginpagefactory(WebDriver driver)
	{
	
	this.driver=driver;
	PageFactory.initElements (driver,this);
	}
	
	public void setValues(String email,String pswd,String login)
	{
	fbemail.sendKeys(email);
	fbpass.sendKeys(pswd);
	loginbutton.sendKeys(login);
	
}}
