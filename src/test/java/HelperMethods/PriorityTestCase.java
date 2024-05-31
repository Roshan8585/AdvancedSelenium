package HelperMethods;

import java.time.Duration; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTestCase {
	@Test(priority = 3, enabled = false)
	public void demo() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		driver.get("https://demowebshop.tricentis.com/");
		driver.close() ;
	}
	@Test(priority = 2, invocationCount = 2, threadPoolSize = 2)
	public void csk() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		driver.get("https://www.chennaisuperkings.com/");
		driver.close() ;
	}
	@Test(priority = 0)
	public void mumbai() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		driver.get("https://www.mumbaiindians.com/");
		driver.close() ;
	}
	@Test(priority = 1)
	public void Rcb() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		driver.get("https://www.royalchallengers.com/");
		driver.close() ;
	}
}
