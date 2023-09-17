package test1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillingformFromExcelFIle {

	public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		//implicitly waits 
			
		driver.manage().window().maximize();
		
		
		
		WebElement fullnamefield = driver.findElement(By.xpath("//input[@id='userName']"));
		fullnamefield.sendKeys(Utilites.readxcelvalue(4, 2));
		Thread.sleep(2000);
		
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		userEmail.sendKeys(Utilites.readxcelvalue(4, 3));
		Thread.sleep(2000);
		
		WebElement currentadd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
		currentadd.sendKeys(Utilites.readxcelvalue(4, 4));
		Thread.sleep(2000);
		
		WebElement permanantadd =driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanantadd.sendKeys(Utilites.readxcelvalue(4, 5));
		Thread.sleep(2000);
		
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitbutton.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
