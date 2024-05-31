package DwsBaseClass20;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass ;
import org.testng.annotations.AfterSuite ;

public class DwsBaseClassSS {
	public static WebDriver driver ;
	@BeforeSuite
	public void Bsuite() {
		System.out.println("DataBase Connection");
	}
	@BeforeTest
	public void BTest() {
		System.out.println("Attributes loaded");
	}
	@BeforeClass
	public void Openbrowser() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
	}
	@BeforeMethod
	public void BMethod() {
		System.out.println("Welcome to page") ;
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Thanks for visiting") ;
	}
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Test Case execution finished");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Data Base Connection Disconnected") ;
	}
}
