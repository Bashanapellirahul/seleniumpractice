package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://chat.openai.com/?model=text-davinci-002-render-sha");
		
		//WebElement fullname = driver.findElement((By.id("userName")).sendKeys("Rahul bashanapelli")));
		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[4]/button[2]"));
		
		loginbutton.click();
		Thread.sleep(2000);
		
		WebElement submitbutton = driver.findElement(By.xpath("//button[@class='c9896a921 c83665ce2 c0062c0fe']"));
		submitbutton.click();
		Thread.sleep(2000);
		
		WebElement enteremail = driver.findElement(By.xpath("//input[@type='email']"));
		enteremail.sendKeys("bashanapellirahul@gmail.com");
		Thread.sleep(2000);
		
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"playCaptchaButton\"]/div/button/div[3]']"));
		nextbutton.click();
		Thread.sleep(2000);
//		
//		WebElement prompttextarea = driver.findElement(By.id("prompt-textarea"));
//	    
//		
//		prompttextarea.sendKeys("regression test cases in Selenium Web Driver using Java in Eclipse,ChromeDriver for cross browser testing");
//		
//		
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[name()='svg'][contains(@class,'h-4 w-4 m-1 md:m-0')]")).click();
//		
//		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
