package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilites {
	
	public static void capturescreenshots(WebDriver driver, String filename) throws IOException {
	

	TakesScreenshot scrnsht = (TakesScreenshot) driver;
	
	//capture screenshot in the form of java object
	
	File objscrfile = scrnsht.getScreenshotAs(OutputType.FILE);
	
	//creating a file at local
	File objTargetFile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/"+filename+".png");
	
	//copy newaly captured source image to a newly created file
	Files.copy(objscrfile, objTargetFile);

}
	
	public static String readxcelvalue(int rowNO, int celNO) throws IOException {
		

		File objfile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/TestData11.xlsx");
		
		//Read the file
		
		FileInputStream objfis = new FileInputStream(objfile);
		
		//Read the sheet from book and then read cell from row of excel
		
		//Apache POI classes
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(objfis)) {
			String cellText=workbook.getSheet("Sheet1").getRow(rowNO).getCell(celNO).toString();
			
			System.out.println(cellText);
			
			return cellText;
		}
		
		
}
	public static String getValue(String key) throws IOException{
		
		// oPEN THE FILE 
		
		File objfile = new File("/Users/rahulbashanapelli/eclipse-workspace/SeleniumDemo/AppConfig/config.properties");
		
		
		// REad the file 
		
		FileInputStream objfis= new FileInputStream(objfile);
		
		// Read properties 
		
		Properties objprop= new Properties();
		
		objprop.load(objfis);
		
		
		return objprop.getProperty(key);
}
	
}
