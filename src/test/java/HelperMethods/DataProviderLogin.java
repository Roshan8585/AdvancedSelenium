package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {
	@Test(dataProvider = "ShopperLogin")
	public void reciever(String email, String password) throws InterruptedException{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)) ;
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click() ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("Email")).sendKeys(email) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("Password")).sendKeys(password) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("Login")).click() ;
		Thread.sleep(2000) ;
		driver.close() ;
	}
	@DataProvider(name = "ShopperLogin")
	public Object[][] sender(){
		return DataProviderUtility.ShopperLogin() ;
	}
	
}
