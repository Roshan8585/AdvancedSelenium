package ShoppersStack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppersUtility extends ShoppersBaseClass{
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click() ;
	}
}
