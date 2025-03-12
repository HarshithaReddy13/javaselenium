package TestCaseDemo;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;

public class Demo {
	public static void main(String[] args) throws Exception {
		browser.openBrowser();
		browser.navigateToUrl();
		page1.userNameEnter("Admin");
		page1.passwordEnter("admin123");
		if(page1.Title().equalsIgnoreCase("Login")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title does not match");
		}
		page1.clickLogin();
		if(page2.Username().equalsIgnoreCase("manda user")){
			System.out.println("user matched");
		}
		else {
			System.out.println("user did not match");;
		}
		page2.searchinList("Leave");
		capture.screenshot("Leave");
		browser.closeBrowser();
	}
}
