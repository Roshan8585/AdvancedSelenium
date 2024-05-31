package HelperMethods;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic {
	@Test(dataProvider = "Login")
	public void reciever(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click() ;
		driver.findElement(By.id("Email")).sendKeys(username) ;
		driver.findElement(By.id("Password")).sendKeys(password) ;
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click() ;
		Thread.sleep(2000) ;
		driver.close();
	}
	@DataProvider(name = "Login") 
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		return DataProviderUtility.dwsLogin() ;
	}
}
