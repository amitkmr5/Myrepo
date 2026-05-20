package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class LoginPage extends BaseLibrary {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement x;
	
	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(1000);
		x.click();	
	}
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
