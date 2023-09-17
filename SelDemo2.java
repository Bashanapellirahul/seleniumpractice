package test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", Utilites.getValue("chromeDriverpath")); 
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get(Utilites.getValue("appurl"));
		
		WebElement homelinkbutton = driver.findElement(By.linkText("Home"));
		
		homelinkbutton.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
