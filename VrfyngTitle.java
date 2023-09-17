package test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VrfyngTitle {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
		System.out.println("Pass:Title is Google");
		}
		
		else {
			System.out.println("Fail: Title is not Google");
		}
		
		TakesScreenshot scrnshts = (TakesScreenshot) driver;
		
		File scrnsht = scrnshts.getScreenshotAs(OutputType.FILE);
		
		///File file = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/scr3.png");
		
		FileUtils.copyFile(scrnsht,new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/scr5.png") );
		
		
		
	

	}

}
