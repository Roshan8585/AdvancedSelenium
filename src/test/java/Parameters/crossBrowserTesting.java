package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	public WebDriver driver ;
	@Parameters("browser")
	@Test
	// Optional is used as default datareader 
	public void crossBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver() ;
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver() ;
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver() ;
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver() ;
		}
		else if(browser.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver() ;
		}
		driver.get("https://www.ajio.com/");
		driver.close() ;
	}
}
