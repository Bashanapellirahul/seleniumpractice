package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
//		driver.get("https://demoqa.com/text-box/");
//		
//		Thread.sleep(3000);
//		
		WebElement fullnamefield = driver.findElement(By.id("userName"));		
		
     	fullnamefield.sendKeys("Rahul");
//		
//		
		WebElement currentAdd = driver.findElement(By.id("currentAddress"));
//		
		currentAdd.sendKeys("215 linden ave jersey city 07305");
		
		
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		

	}

}
