package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingXLfiles {

	public static void main(String[] args) throws IOException {
		
		//Open the file in read mode
		
		File objfile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/TestData11.xlsx");
		
		//Read the file
		
		FileInputStream objfis = new FileInputStream(objfile);
		
		//Read the sheet from book and then read cell from row of excel
		
		//Apache POI classes
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(objfis)) {
			String cellText=workbook.getSheet("Sheet1").getRow(2).getCell(3).toString();
			
			System.out.println(cellText);
		}
		
	}

}
