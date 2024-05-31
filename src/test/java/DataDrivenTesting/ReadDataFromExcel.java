package DataDrivenTesting;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void readData() throws EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\Roshan\\Downloads\\Book2.xlsx") ;
		FileInputStream fis = new FileInputStream(path) ;
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sheet = wb.getSheet("Sheet1") ;
//		String s1 = sheet.getRow(0).getCell(0).toString() ;
//		String s2 = sheet.getRow(0).getCell(1).toString() ;
//		String s3 = sheet.getRow(1).getCell(0).toString() ;
//		String s4 = sheet.getRow(1).getCell(1).toString() ;
//		System.out.println(s1) ;
//		System.out.println(s2) ;
//		System.out.println(s3) ;
//		System.out.println(s4) ;
		
//		int row = 5 ;
//		int colum = 2 ;
		
		int row = sheet.getPhysicalNumberOfRows() ;
		int colum = sheet.getRow(0).getPhysicalNumberOfCells() ;
		for(int i=0; i<row; i++) {
			for(int j=0; j<colum; j++) {
				String s = sheet.getRow(i).getCell(j).toString();
				System.out.println(s) ;
			}
		}
	}
}
