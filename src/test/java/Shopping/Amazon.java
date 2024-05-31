package Shopping;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test(groups = "smoke")
	public void amazon() throws InterruptedException{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000) ;
		driver.close() ;
	}
}
