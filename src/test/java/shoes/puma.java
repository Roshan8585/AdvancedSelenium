package shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class puma {
	@Test(groups = "regression")
	public void Puma() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=PS&utm_aud=OTH&utm_obj=OLC&utm_campaign=PS_GGL_IN_PS_GGL_SEA_TXT_Brand_Category_FTW_agency_1000067495857508873&gad_source=1&gclid=CjwKCAjwi_exBhA8EiwA_kU1MnJI4s9rPwJvUzI6BBCYfWS8CfBJSMgo5bb5xhk6c62ve6yZ4Hu3oRoCcjkQAvD_BwE");
		driver.close() ;
	}
}
