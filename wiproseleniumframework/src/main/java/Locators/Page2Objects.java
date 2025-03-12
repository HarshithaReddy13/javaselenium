package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;

public class Page2Objects extends browser{
	static By list=By.xpath("//ul[@class='oxd-main-menu']/li");
	static By username=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
	static By searchumenuname=By.cssSelector("[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	public static List<WebElement> listBar() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(list));
		return driver.findElements(list);
	}
	public static WebElement Username() {
		return driver.findElement(username);
	}
	public static WebElement menuName()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchumenuname));
		return driver.findElement(searchumenuname);
	}

}
 