package DWS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWSBaseClass {
	WebDriver driver ;
	@BeforeSuite
	public void DatabaseConnection() throws EncryptedDocumentException, IOException {
		System.out.println("DataBase Connected");
	}
	@BeforeTest
	public void readData() {
		System.out.println("Data has been fetched ") ;
	}
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)) ;
	}
	@BeforeMethod
	public void openBrower() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
	}
	
	@AfterMethod
	public void postLogin() {
		System.out.println("Login has been executed") ;
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000) ;
		driver.quit() ;
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Brower has been closed ") ;
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Data Base connection disconnected");
	}
	@DataProvider (name = "DWSLogin")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		return DWS_Resource.DWS_resource() ;
	}
}
