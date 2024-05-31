package Shopping;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
	@Test(groups = "smoke")
	public void ajio() throws InterruptedException{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000) ;
		driver.close() ;
	}
}
