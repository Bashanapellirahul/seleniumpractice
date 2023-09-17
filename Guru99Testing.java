package test1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Testing {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",Utilites.getValue("chromeDriverpath"));
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(Utilites.getValue("Guru99url"));
		
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		userid.sendKeys("mngr520313");
		
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(2000);
		password.sendKeys("venYhYg\n");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(2000);
		
		loginbutton.click();
		
		driver.close();
	}

}
