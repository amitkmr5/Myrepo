package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage obj;
	@BeforeTest
	@Parameters("browserName")
	public void url(String browsername)
	{
		launchUrl(browsername);	
		obj = new LoginPage();
	}
	
	@Test
	public void clickonclose() throws InterruptedException
	{
		obj.clickonclose();
		
	}
	
	@Test
	public void gettitle()
	{
		obj.gettitle();
	}

}
