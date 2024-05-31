package Listerners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listerners.DwsLogin.class)
public class TcDwsLogin {
	@Test
	public void Login() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click() ;
		driver.findElement(By.id("Email")).sendKeys("roshansawant@gmail.com") ;
		driver.findElement(By.id("Password")).sendKeys("admin@02") ;
		driver.findElement(By.cssSelector("input[value='Log i']")).click() ;
	}
	@Test
	public void redbus() throws InterruptedException{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000) ;
		driver.close() ;
	}
	@Test(dependsOnMethods = "Login")
	public void maniBiryani() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.get("https://manis.in/");
		driver.close() ;
	}
}
