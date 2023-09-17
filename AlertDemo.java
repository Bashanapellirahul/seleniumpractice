package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demoqa.com/alerts ");
		
		WebElement promtbutton = driver.findElement(By.id("promtButton"));
		
		promtbutton.click();
		
		//switch to the alert using switchto method of the webdriver interface
		
		//HOW WILL U HANDLE ALERTS USING SELENIUM??
		
		//ALERT IS AN INTERFACE. WE  WILL USE THE ALERT INTERFACE AND ITS METHODS LIKE ACCEPT,DISMISS , SWITCHTO, SENDKEYS AND GETTEXT.
		
		//FIRST WE HAVE TO USE THE SWITHCTO METHOD TO SWITHC TO THE ALERT FROM THE LANDING PAGE AND THEN WE HAVE TO USE THE METHODS OF ALERT INTERFACE.
		
		Alert objalert = driver.switchTo().alert();
		//use methods of alert interface
		
		
		Thread.sleep(2000);
		
		System.out.println("text dispalayed on alret window:"+ objalert.getText());
		
		Thread.sleep(2000);
		
		objalert.sendKeys("my is rahul");
		
		Thread.sleep(2000);
		
		objalert.accept();
		Thread.sleep(2000);
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
