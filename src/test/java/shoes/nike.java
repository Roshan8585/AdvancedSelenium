package shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nike {
	@Test(groups = "regression")
	public void Nike() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.nike.com/in/w/mens-shoes-nik1zy7ok");
		driver.close() ;
	}
}
