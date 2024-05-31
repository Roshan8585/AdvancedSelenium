package HelperMethods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderUtility {
	public static Object[][] dwsDataProvider(){
		Object[][] obj = new Object[2][2] ;
		obj[0][0] = "admin01@gmail.com" ;
		obj[0][1] = "admin01" ;
		obj[1][0] = "admin02@gmail.com" ;
		obj[1][1] = "admin02" ;
		return obj ;
	}
	
	public static Object[][] dwsLogin() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[2][2] ;
		FileInputStream fis = new FileInputStream("C:\\Users\\Roshan\\Downloads\\Book2.xlsx") ;
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sheet = wb.getSheet("Sheet1") ;
//		obj[0][0] = sheet.getRow(0).getCell(0).toString() ;
//		obj[0][1] = sheet.getRow(0).getCell(1).toString() ;
//		obj[1][0] = sheet.getRow(1).getCell(0).toString() ;
//		obj[1][1] = sheet.getRow(1).getCell(1).toString() ;
		//OR
		for(int i=0; i<obj.length; i++) {
			for(int j=0; j<obj.length; j++) {
				obj[i][j] = sheet.getRow(i).getCell(j).toString() ;
			}
		}
		return obj ;
//		for(int i=0; i<obj.length; i++) {
//			for(int j=0; j<obj.length; j++) {
//				System.out.println(obj[i][j]) ;
//			}
//		}
	}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		dwsLogin() ;
//	}
	public static Object[][] ShopperLogin() {
		Object[][] obj = new Object[2][2] ;
		obj[0][0] = "roshansawant@gmail.com" ;
		obj[0][1] = "roshan" ;
		obj[1][0] = "sawantroshan@gmail.com" ;
		obj[1][1] = "sawant" ;
		return obj ;
	}
}
