package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;
import Locators.Page1Objects;
import ScreenShot.capture;

public class page1 extends browser{
	public static void userNameEnter(String data) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Page1Objects.Username()));
			Page1Objects.Username().sendKeys(data);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Page1 - Username");
		}
	}
	public static void passwordEnter(String data) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Page1Objects.Password()));
			Page1Objects.Password().sendKeys(data);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Page1 - Password");
		}
	}
	public static void clickLogin() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Page1Objects.Login()));
			Page1Objects.Login().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Page1 - Login");
		}
	}
	public static String Title() throws Exception {
		logger1.addScreenCaptureFromPath(capture.screenshot("title"));
		return Page1Objects.getTitle().getText();
	}
}
