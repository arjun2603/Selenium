package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG {

	@BeforeTest
	public void set()
	{
		System.out.println("browser");
	}
	
	
	@BeforeMethod
	public void load()
	{
		System.out.println("url");
		
	}
	
	@Test(groups = {"sanity"})
	
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = {"smoke"})
	
	public void test2()
	
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("after");
	}
	
	@AfterTest
	public void quit()
	{
		System.out.println("quit");
	}
	
}



