package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS {
	@Test
	public void dws() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.get("https://demowebshop.tricentis.com/") ;
		driver.close();
	}
}
