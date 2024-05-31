package DWS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DWS_Resource {
	public static Object[][] DWS_resource() throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Roshan\\Downloads\\Book2.xlsx") ;
		FileInputStream fis = new FileInputStream(file) ;
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sheet = wb.getSheet("Sheet1") ;
		Object[][] obj = new Object[2][2] ;
		for(int i=0; i<obj.length; i++) {
			for(int j=0; j<obj.length; j++) {
				obj[i][j] = sheet.getRow(i).getCell(j).toString() ;
			}
		}
		return obj ;
	}
}
