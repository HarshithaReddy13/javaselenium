package TestCaseDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.browser;
import ScreenShot.capture;

public class Test1 {
	
	@BeforeMethod
	public void openbrowser() throws Exception
	{
		browser.init("Test1Report");
		browser.openBrowser();
		browser.navigateToUrl();
		
	}
	
	@DataProvider(name="title")
	public Object[] data()
	{
		Object[] obj= {"OrangeHRM"};
		return obj;
	}
	
	@Test(priority=1 ,dataProvider = "title")
	public void TestTitle(String title) throws Exception 
	{
		Assert.assertEquals(browser.driver.getTitle(), title);
		capture.screenshot("title");
		Reporter.log("Screenshot taken by name title");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		browser.closeBrowser();
	}

}
