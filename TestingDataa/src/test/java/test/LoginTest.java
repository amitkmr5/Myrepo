package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage obj;
	@BeforeTest
	public void url()
	{
		launchUrl();	
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
