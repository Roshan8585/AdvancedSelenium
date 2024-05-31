package DWS2;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(com.crm.Listerners.DwsLogin.class)
public class DWSFillDataUtility extends DWSBaseClass{
	@Parameters({"name", "recipientsEmail", "senderName", "senderEmail", "senderMessage"})
	@Test
	public void fillData(String name, String recipientsEmail, String senderName, String senderEmail, String senderMessage) throws InterruptedException {
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click() ;
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click() ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(name) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(recipientsEmail) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys(senderName) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys(senderEmail) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_1_Message")).sendKeys(senderMessage) ;
	}
}
