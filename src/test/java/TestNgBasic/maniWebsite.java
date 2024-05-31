package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class maniWebsite {
	@Test
	public void mani() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.get("https://manis.in/") ;
		driver.close();
	}
}
