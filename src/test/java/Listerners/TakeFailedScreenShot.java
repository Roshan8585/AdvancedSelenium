package Listerners;

import static org.testng.Assert.assertEquals; 

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DwsBaseClass20.DwsBaseClassSS;
@Listeners(com.crm.Listerners.DwsOnFailed.class)
public class TakeFailedScreenShot extends DwsBaseClassSS{
	@Test
	public void dwsLoginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click() ;
		driver.findElement(By.id("Email")).sendKeys("admin07@gmail.com") ;
		driver.findElement(By.id("Password")).sendKeys("admin@1234") ;
		driver.findElement(By.cssSelector("input[value='Log in']")).click() ;
		driver.findElement(By.linkText("Log out")).click() ;
	}
	@Test
	public void dwsLoginFailed() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click() ;
		driver.findElement(By.id("Email")).sendKeys("admin07@gmail.com") ;
		driver.findElement(By.id("Password")).sendKeys("admin@123") ;
		driver.findElement(By.cssSelector("input[value='Log in']")).click() ;
		driver.findElement(By.linkText("Log out")).click() ;
	}
	@Test
	public void redBus() {
		driver.get("https://www.redbus.in/");
		assertEquals("roshan", "roshann");
		driver.findElement(By.className("img_new_wrap")).click() ;
	}
}
