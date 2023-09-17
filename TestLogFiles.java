package test1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestLogFiles {

	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("/Users/rahulbashanapelli/eclipse-workspace/SeleniumDemo/AppConfig/log4j.properties");
		
		Logger objlog = Logger.getLogger("devpinoyLogger");
		
		objlog.info("Starting the chrome browser");
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/bin/chromedriver_mac_arm64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		objlog.info("Launching the url");
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		objlog.info("closing the chrome browser");
		
	
	
	}

}
