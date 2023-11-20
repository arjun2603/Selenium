package junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {

	String baseurl="https://www.ebay.com";
	
	ChromeDriver driver;
	
@Before
	public void setup()
{
	driver = new ChromeDriver();
	driver.get(baseurl);
	
	
}
	
	@Test
	public void test() throws Exception
	{
		URL u =new URL(baseurl);
		
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		System.out.println(con.getResponseCode());
		
		
		
	}
	
	@After
	
	public void quit()
	{
		driver.quit();
	}
	
	
	
}
