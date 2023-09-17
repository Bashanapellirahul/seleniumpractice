package test1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadingFileDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		//implicitly waits 
			
		driver.manage().window().maximize();
		
		
		Utilites.capturescreenshots(driver, "Step1_launchpage");	//capturing the launch page
		
		
		WebElement uploadbutton = driver.findElement(By.id("uploadfile_0"));		//uploading the file 
		Thread.sleep(2000);
		uploadbutton.sendKeys("/Users/rahulbashanapelli/Desktop/wynicsco_QA_HomeWorks/sandip/Core  Java  Part I.pdf");		//path of the file
		Utilites.capturescreenshots(driver, "Steop2_uploading file");		//capturing the img after uploading the file
		
		
		WebElement termcheckbox = driver.findElement(By.xpath("//input[@id='terms']"));		
		Thread.sleep(2000);
		termcheckbox.click();
		Utilites.capturescreenshots(driver, "Steop3_TermCheckBox");		//capturing the page after clicking the check box
		
		
		
		WebElement submitbutton = driver.findElement(By.id("submitbutton"));
		
		Thread.sleep(2000);
		submitbutton.click();
		Utilites.capturescreenshots(driver, "Steop4_submitbutton");		//CAPTURING THE IMG AFTER CLICKING ON THE SUBMIT BUTTON
	
		driver.close();
		
		//FileUtils.copyFile(objscrfile, objTargetFile);
		
		
			
			

	}

}
