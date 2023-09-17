package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/radio-button");
		
	Thread.sleep(2000);
		
		WebElement radiobutton = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		Thread.sleep(2000);
		radiobutton.click();
		Thread.sleep(2000);
		System.out.println("Text after clicking the Radio button is: "+radiobutton.getText());
		
		
		driver.quit();
		//

	}

}
