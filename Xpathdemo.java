package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException    {
		
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		Thread.sleep(2000);
		
		WebElement fullname = driver.findElement(By.xpath("//input[@id='userName']"));
		
		fullname.sendKeys("Rahul bashanapelli");
		
		//String value = fullname.getAttribute("userName");
		
		driver.close();
		
 
	}

}
