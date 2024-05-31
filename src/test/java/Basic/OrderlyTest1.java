package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrderlyTest1 {
	@BeforeSuite
	public void BeforeSuite() {
		
	}
	@BeforeTest
	public void BeforeTest() {
		
	}
	@BeforeClass
	public void BeforeClass() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
	}
	@BeforeMethod
	public void BeforeMethod() {
		
	}
}
