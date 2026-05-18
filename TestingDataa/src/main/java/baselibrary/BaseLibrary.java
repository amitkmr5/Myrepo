package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary {
	
	static public WebDriver driver;
	public void launchUrl()
	{
		driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();	
	}

}
