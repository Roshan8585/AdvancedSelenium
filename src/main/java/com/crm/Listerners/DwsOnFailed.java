package com.crm.Listerners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import DwsBaseClass20.DwsBaseClassSS;

public class DwsOnFailed extends DwsBaseClassSS implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case has been failed");
		LocalDateTime t = LocalDateTime.now() ;
		String temp = t.toString().replaceAll(":", "-") ;
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File from = ts.getScreenshotAs(OutputType.FILE) ;
		File to = new File("./ScreenShot/dws"+temp+".png") ;
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
