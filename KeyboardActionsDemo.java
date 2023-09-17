package test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", Utilites.getValue("chromeDriverpath"));
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get(Utilites.getValue("googleurl"));
		
		WebElement searchIcon = driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		
		Actions objactions = new Actions(driver);
		
		Thread.sleep(2000);
		
		//how will u handle the keyboard and mouse actions using selenium
		//we will use actions class and actions interface methods. there are certain methods  like sendkeys, build, perform which i will use to perform
		// those actions 
		
		objactions.moveToElement(searchIcon).build().perform();
		
		Thread.sleep(2000);
		
		WebElement googlesearch = driver.findElement(By.name("q"));
		
		googlesearch.sendKeys("selenium");
		
		for(int i = 0; i<10; i++) {
			
			Thread.sleep(2000);
			
			objactions.sendKeys(args);
		}
	}

}
