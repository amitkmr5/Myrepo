package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseLibrary {
	
	public static WebDriver driver;
	public void launchUrl(String browserName)
	{
		if(browserName.equals("edge")) 
		{
		driver = new EdgeDriver();
		}
		
		else if(browserName.equals("firefox")) 
		{
		driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("chrome")) 
		{
		driver = new ChromeDriver();
		}
		
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();	
	}

}
