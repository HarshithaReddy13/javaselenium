package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import Browser.browser;
import Locators.Page2Objects;

public class page2 extends browser{
	public static void searchinList(String listdata) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> li = Page2Objects.listBar();
		for(int i =0;i<li.size();i++)
		{
			if(li.get(i).getText().equalsIgnoreCase(listdata))
			{
				li.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	public static String Username() {
		return Page2Objects.Username().getText();
	}
	public static String MenuName()
	{
		return Page2Objects.menuName().getText();
	}

}
