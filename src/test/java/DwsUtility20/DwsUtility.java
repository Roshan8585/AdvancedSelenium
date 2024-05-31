package DwsUtility20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DwsBaseClass20.DwsBaseClass;

@Listeners(com.crm.Listerners.DwsLogin.class)
public class DwsUtility extends DwsBaseClass{
	@Test
	public void Main() throws InterruptedException{
		driver.findElement(By.linkText("Digital downloads")).click();
		List<WebElement> AddToCart = driver.findElements(By.cssSelector("input[value='Add to cart']")) ;
		for(WebElement e : AddToCart) {
			Thread.sleep(1000);
			e.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click() ;
	}
}
