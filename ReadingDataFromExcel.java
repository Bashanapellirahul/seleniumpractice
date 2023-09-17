package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		File objfile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/TestData11.xlsx");
		
		FileInputStream objfis = new FileInputStream(objfile);
		
		try (XSSFWorkbook objtext = new XSSFWorkbook(objfis)) {
			String celltext = objtext.getSheet("Sheet1").getRow(4).getCell(3).toString();
			
			System.out.println(celltext);
		}
		
		
	}

}
