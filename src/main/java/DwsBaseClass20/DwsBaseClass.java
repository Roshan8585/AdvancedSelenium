package DwsBaseClass20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

import com.crm.ReadDataFromExternal.ReadDataFromExcel;
import com.crm.ReadDataFromExternal.ReadDataUtility;


public class DwsBaseClass {
	public WebDriver driver ;
	String url ;
	String username ;
	String password ;
	String sheetnum ;
	Properties prop ;
	File file ;
	FileInputStream fis ;
	public String urlMethod ;
	Sheet sheet ;
	public String rname ;
	public String remail ;
	public String mname ;
	public String memail ;
	public String message ;
	
	@BeforeSuite
	public void ReadPropertyData() throws IOException {
//		Externally reading Data from property file
		url = ReadDataUtility.ReadPropertyData("url") ;
		username = ReadDataUtility.ReadPropertyData("username") ;
		password = ReadDataUtility.ReadPropertyData("password") ;
		sheetnum = ReadDataUtility.ReadPropertyData("sheetNumber") ;
				
//		Externally reading Data from Excel file
		rname = ReadDataFromExcel.readDataExcel(sheetnum, 0, 1) ;
		remail = ReadDataFromExcel.readDataExcel(sheetnum, 1, 1) ;
		mname = ReadDataFromExcel.readDataExcel(sheetnum, 2, 1) ;
		memail = ReadDataFromExcel.readDataExcel(sheetnum, 3, 1) ;
		message = ReadDataFromExcel.readDataExcel(sheetnum, 4, 1) ;
	}
	@BeforeTest
	public void PreTest() {
		System.out.println("Precondition for test runner");
	}
	@BeforeClass
	public void OpenBrowser() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get(url);
	}
	@BeforeMethod
	public void CommonStep() {
		driver.findElement(By.linkText("Log in")).click() ;
		driver.findElement(By.id("Email")).sendKeys(username) ;
		driver.findElement(By.id("Password")).sendKeys(password) ;
		driver.findElement(By.cssSelector("input[value='Log in']")).click() ;
	}
	@AfterMethod
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void CloseBrowser() {
		driver.close() ;
	}
	@AfterTest
	public void PostTestRunner() {
		System.out.println("Post Condition for test runner");
	}
	@AfterSuite
	public void DataBaseDisconnect() {
		System.out.println("DataBase Disconnected");
	}
}
