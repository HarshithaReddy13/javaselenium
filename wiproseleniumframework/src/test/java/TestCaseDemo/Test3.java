package TestCaseDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.browser;
import Locators.Page2Objects;
import Pages.page1;
import Pages.page2;

public class Test3 {
	@BeforeMethod
	public void openbrowser() throws Exception
	{
		browser.init("Test3Report");
		browser.openBrowser();
		browser.navigateToUrl();
		
	}
		
	@Test
	public void TestMenu() throws InterruptedException
	{
		page1.userNameEnter("Admin");
		page1.passwordEnter("admin123");
		page1.clickLogin();
		page2.searchinList("leave");
		Assert.assertEquals(Page2Objects.menuName().getText(),"Leave");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		browser.closeBrowser();
	}

}
