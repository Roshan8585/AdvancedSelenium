package ShoppersStack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
import org.testng.annotations.Test;

public class ShoppersBaseClass {
	Properties prop ;
	WebDriver driver ;
	String url ;
	String email ; 
	String password ;
	
	@BeforeSuite 
	public void BeforeSuite() throws IOException {
		prop = new Properties() ;
		File file = new File("C:\\Users\\Roshan\\eclipse-workspace\\AdvancedSelenium\\src\\test\\resources\\ProjectDriver\\ProjectDriverResource.properties");
		FileInputStream fis = new FileInputStream(file) ;
		prop.load(fis);
	}
	@BeforeTest
	public void ReadData() {
		url = prop.getProperty("url") ;
		email = prop.getProperty("email") ;
		password = prop.getProperty("password") ;
	}
	@BeforeClass
	public void testSetUp() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)) ;
	}
	@BeforeMethod
	public void OpenBrower() {
		driver.get(url);
		driver.findElement(By.id("loginBtn")).click() ;
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
}
