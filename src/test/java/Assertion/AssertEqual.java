package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqual {
	@Test
	public void hardAssert() {
		String a = null ;
		String b = null ;
		String c = "pune" ;
		String expectedUrl = "https://demowebshop.tricentis.com/" ;
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl() ;
		boolean result = expectedUrl.equals(currentUrl) ;
		assertEquals(expectedUrl, currentUrl);
		assertNotEquals(expectedUrl, "Roshan") ;
		assertNull(a) ;
		assertNull(a,b) ;
		assertNotNull(c) ;
		assertTrue(false) ; // throw an exception 
		assertFalse(true) ; // throw an exception
		assertTrue(result) ;// will not throw exception
		
		//SoftAssert
		
		SoftAssert ass = new SoftAssert() ;
		ass.assertEquals(expectedUrl, currentUrl) ; //even it fails it will execute below line of code 
		ass.assertTrue(result) ;
		ass.assertNull(c) ;
		driver.findElement(By.id("small-searchterms")).sendKeys("Satya") ;
		driver.findElement(By.cssSelector("input[type='submit']")).click() ;
		driver.close() ;
		ass.assertAll() ;
	}
}
