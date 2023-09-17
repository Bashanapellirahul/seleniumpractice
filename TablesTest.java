package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "//Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new  ChromeDriver();		
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");	//url
		
		WebElement tablecell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[5]"));	//xpath from DOM
		
		System.out.println("the text in the cell is : "+tablecell.getText()); 	//getText method to get the value 
		//tablecell.getAccessibleName();
		
		//in dynamic tables the values will change and we have to write the logic to get the particular value

		//driver.quit();
	}

}
