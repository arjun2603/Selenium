package testng;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popuphandle {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		Map<String, Integer> prefs=new HashMap<String, Integer>();
		prefs.put("profile.default_content_setting_values.notifications",1);
		options.setExperimentalOption("prefs",prefs);
	     driver=new ChromeDriver(options);
		
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com");
		
	}
	

}
