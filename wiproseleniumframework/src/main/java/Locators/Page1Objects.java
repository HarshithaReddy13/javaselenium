package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;

public class Page1Objects extends browser{
	static By username = By.name("username");
	static By password = By.name("password");
	static By clickLogin=By.xpath("//button[@type='submit']");
	static By title=By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/h5");
//	 Method to get element of search text box and store it
	public static WebElement Username() {
		WebElement element = driver.findElement(username);
		return element;
	}
	
	public static WebElement Password() {
		WebElement element = driver.findElement(password);
		return element;
	}
	public static WebElement Login() {
		WebElement element = driver.findElement(clickLogin);
		return element;
	}
	public static WebElement getTitle() {
		return driver.findElement(title);
	}
}
