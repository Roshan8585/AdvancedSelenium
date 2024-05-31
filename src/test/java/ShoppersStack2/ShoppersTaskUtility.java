package ShoppersStack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShoppersTaskUtility extends ShoppersTaskBaseClass{
	@Test
	public void main() throws InterruptedException {
		Actions a = new Actions(driver) ;
		WebElement element = driver.findElement(By.xpath("//a[@id='men']")) ;
		Thread.sleep(1000);
		a.moveToElement(element).perform() ;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click() ;
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='add to cart']")) ;
		int count =0 ;
		try {
			for(WebElement e: elements) {
				Thread.sleep(1000) ;
				e.click() ;
			}
		}
		catch(Exception e) {
			driver.findElement(By.cssSelector("div[class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click() ;
			Thread.sleep(1000) ;
			driver.findElement(By.xpath("//li[text()='Logout']")).click() ;
			count = 1 ;
		}
		if(count == 0) {
			driver.findElement(By.cssSelector("div[class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click() ;
			Thread.sleep(1000) ;
			driver.findElement(By.xpath("//li[text()='Logout']")).click() ;
		}
	}
}
