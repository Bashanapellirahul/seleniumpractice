package test1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFIleExemple {

	public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		//implicitly waits 
			
		driver.manage().window().maximize();
		
		//Utilites.capturescreenshots(driver, "Launch_page");
		
		WebElement uploadbutton = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		uploadbutton.sendKeys("/Users/rahulbashanapelli/Downloads/sampleFile.jpeg");
		
		Thread.sleep(2000);
		
//		WebElement uploadbutton2 = driver.findElement(By.xpath("//label[@class='btn btn--file btn--primary btn--upload']"));
//		
//		uploadbutton2.sendKeys();
		
	}

}
