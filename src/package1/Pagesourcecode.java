package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcecode {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
			{
			System.out.println("gmail is present");
			}
		else
		{
			System.out.println("nil");
		}
	}

}
