package DWS2;

import java.time.Duration;

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
import org.testng.annotations.Parameters;

public class DWSBaseClass {
	WebDriver driver ;
	@BeforeSuite
	public void DataBaseConnection() {
		System.out.println("DataBase Connection");
	}
	@BeforeTest
	public void TestRunner() {
		System.out.println("PreCondition for test runner") ;
	}
	@Parameters("url")
	@BeforeClass
	public void OpenBrowser(String url) {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		driver.get(url);
	}
	@Parameters({"email", "password"})
	@BeforeMethod
	public void PreOperations(String email, String password) throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password) ;
		driver.findElement(By.cssSelector("input[value='Log in']")).click() ;
		WebElement element = driver.findElement(By.xpath("//h3[text()='Follow us']")) ;
		js.executeScript("arguments[0].scrollIntoView(true)",element) ;
		Thread.sleep(2000) ;
	}
	@AfterMethod
	public void PostLogin() {
		System.out.println("Login succesful") ;
	}
	@AfterClass
	public void quiteBrowser() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit() ;
	}
	@AfterTest
	public void PostTest() {
		System.out.println("Post Conditions of Test Runner");
	}
	@AfterSuite
	public void DataBase() {
		System.out.println("DataBase Disconnected") ;
	}
}
