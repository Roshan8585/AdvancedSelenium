package ShoppersStack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ShoppersTaskBaseClass {
	WebDriver driver ;
	Sheet sheet ;
	String url ;
	String email ;
	String password ;
	String ChangedFirstName ;
	String ChangedSecondName ;
	String ChangedPhoneNumber ;
	@BeforeSuite
	public void dataBaseConnection() throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Roshan\\Downloads\\ShoppersStackCredentials.xlsx") ;
		FileInputStream fis = new FileInputStream(file) ;
		Workbook wb = WorkbookFactory.create(fis) ;
		sheet = wb.getSheet("Sheet1") ;
	}
	@BeforeTest
	public void ReadData() {
		url = sheet.getRow(0).getCell(0).toString() ;
		email = sheet.getRow(1).getCell(0).toString() ;
		password = sheet.getRow(2).getCell(0).toString() ;
		ChangedFirstName = sheet.getRow(3).getCell(0).toString() ;
		ChangedSecondName = sheet.getRow(4).getCell(0).toString() ;
		ChangedPhoneNumber = sheet.getRow(5).getCell(0).toString() ;
	}
	@BeforeClass
	public void taskSetup() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)) ;
	}
	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		driver.get(url) ;
		Thread.sleep(2000) ;
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		WebElement e = driver.findElement(By.xpath("//button[text()='Login']")) ;
		js.executeScript("arguments[0].click()",e) ;
		
//		driver.findElement(By.xpath("//button[text()='Login']")).click() ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000) ;
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000) ;
		driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout Functionality") ;
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.close(); 
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("Execution of AfterTest") ;
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.print("Diconnect database");
	}
}
