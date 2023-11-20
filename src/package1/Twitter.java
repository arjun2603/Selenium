package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.twitter.com");
		
		String act=driver.getTitle();
		
		String exp="X";
		
		if(act.equals(exp))
		{
			System.out.println("pass");
		}

		else
		{
			System.out.println("fail");
		}
	}

}
