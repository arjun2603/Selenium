package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters122
{
	
	@Parameters("a")
	@Test
	
	public void setup(String a)
	{
		System.out.println(a);
		
	}

}
