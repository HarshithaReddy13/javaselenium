package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Browser.browser;

public class capture extends browser{
	private static final String FileUtils = null;

	public static String screenshot(String name) throws Exception { 
		String path=null;
		try {
			TakesScreenshot shot = ((TakesScreenshot) driver);
			File source = shot.getScreenshotAs(OutputType.FILE);
			path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
			File destination = new File(path);
			source.renameTo(destination);
		} catch (Exception e) {
			System.out.println("Screenshot");
		}
		return path;
	}
}
