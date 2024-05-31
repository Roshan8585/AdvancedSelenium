package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class PrimeData {
	@Test
	public void PrimeData() throws EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\Roshan\\Downloads\\Book1.xlsx") ;
		FileInputStream file = new FileInputStream(path) ;
		Workbook wb = WorkbookFactory.create(file) ;
		Sheet sheet = wb.getSheet("Sheet1") ;
		int row = sheet.getPhysicalNumberOfRows() ;
		int colum = sheet.getRow(0).getPhysicalNumberOfCells() ;
		for(int i=0; i<row; i++) {
			for(int j=0; j<colum; j++) {
				Cell result = sheet.getRow(i).getCell(j) ;
				int convertedResult = (int) result.getNumericCellValue() ;
				int k ;
				for(k=2; k<convertedResult; k++) {
					if(convertedResult%k==0) {
						break ;
					}
				}
				if(k==convertedResult) {
					System.out.println(convertedResult) ;
				}
			}
		}
	}
}
