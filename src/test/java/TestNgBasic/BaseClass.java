package TestNgBasic;

import java.time.Duration;

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

public class BaseClass {
	WebDriver driver ;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase Connection") ;
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre Condition for test Runner");
	}
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void BeforeMethod()  throws InterruptedException{
		driver.findElement(By.xpath("(//input[@type='button'])[4]")).click() ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click() ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click() ;
	}
	@AfterMethod
	public void AfterMethod() {
		driver.findElement(By.linkText("Log in")).click();
	}
	@AfterClass
	public void AfterClass() {
		driver.close();
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("Post Condition for test Runner") ;
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Disconnect for database") ;
	}
}
