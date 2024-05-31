package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXmlFile {
	@Parameters({"url", "email", "password"})
	@Test
	public void ShopperStack(String url, String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.get(url) ;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn"))) ;
		WebElement loginButton = driver.findElement(By.id("loginBtn")) ;
		if(!loginButton.isEnabled()) {
			loginButton.click() ;
		}
		else {
			JavascriptExecutor js = (JavascriptExecutor) driver ;
			js.executeScript("arguments[0].click()",loginButton) ;
		}
		Thread.sleep(1000) ;
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000) ;
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000) ;
		driver.findElement(By.id("Login")).click();
	}
}
