package DwsUtility20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DwsBaseClass20.DwsBaseClass;

@Listeners(com.crm.Listerners.DwsLogin.class)
public class DwsUtilityGiftCard extends DwsBaseClass{
	@Test
	public void mainTest() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click() ;
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys(rname) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(remail) ;
		Thread.sleep(1000) ;	
		driver.findElement(By.id("giftcard_2_SenderName")).clear();
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys(mname) ; 
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_2_SenderEmail")).clear() ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys(memail) ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("giftcard_2_Message")).sendKeys(message) ;
	}
}
