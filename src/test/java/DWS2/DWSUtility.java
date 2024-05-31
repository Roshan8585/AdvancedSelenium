package DWS2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DWSUtility extends DWSBaseClass{
	@Test
	public void mainTest() throws InterruptedException{
		List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']")) ;
		for(WebElement e : links) {
			Thread.sleep(1000);
			e.click();
		}
	}
}
