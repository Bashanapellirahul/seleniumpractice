package test1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		//implicitly waits 
			
			driver.manage().window().maximize();		//this will maximize the window
		
		
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//go inside the frame
		
		driver.switchTo().frame("a077aa5e");	//switching to the frame from default page
		
		Thread.sleep(2000);
		
		WebElement jmeterimg = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		jmeterimg.click();
		
		//comming out of the frame
		driver.switchTo().defaultContent();		//switching to the default page i.e., main page
		
		WebElement mailadd = driver.findElement(By.id("philadelphia-field-email"));
		
		Thread.sleep(2000);
		mailadd.sendKeys("rahulbashanapelli@gmail.com");
		
		WebElement submitbutton = driver.findElement(By.xpath("//button[@class='btn']"));
		Thread.sleep(2000);
		submitbutton.click();
		
		Thread.sleep(2000);
		
		Alert objalert = driver.switchTo().alert();
		
		System.out.println("text dispalayed on alret window:"+ objalert.getText());
		
		objalert.accept();
		
		driver.quit();
		
		
		
		
	}

}
