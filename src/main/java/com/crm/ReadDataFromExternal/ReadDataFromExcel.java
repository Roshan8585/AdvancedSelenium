package com.crm.ReadDataFromExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static String readDataExcel(String numSheet, int row, int cell) throws IOException{
		File file = new File("C:\\Users\\Roshan\\Downloads\\DwsGiftCartResource.xlsx") ;
		FileInputStream fis = new FileInputStream(file) ;
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sheet = wb.getSheet(numSheet) ;
		String result = sheet.getRow(row).getCell(cell).toString() ;
		return result ;
	}
	
}
