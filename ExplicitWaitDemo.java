package test1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitDemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement onClickButton = driver.findElement(By.xpath(" //button[text()='Click me to start timer']"));
		
		onClickButton.click();
		
		WebElement textelement = driver.findElement(By.id("demo"));
		
		//WebDriverWait objexplwait= new WebDriverWait(driver, 20);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElement(textelement,"WebDriver"));
		
		System.out.println("Text is :" + textelement.getText ());
		
		//driver.quit();
		
	}

}
