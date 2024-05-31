package DWS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_Utility extends DWSBaseClass {
	@Test(dataProvider = "DWSLogin")
	public void DWS_Login(String email, String Password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(Password) ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click() ;
		Thread.sleep(2000);
	}
}
