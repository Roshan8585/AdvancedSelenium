package shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class adidas {
	@Test(groups = "regression")
	public void Adidas() {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.adidas.co.in/shoes?cm_mmc=AdieSEM_Google-_-adidas-Brand_Expanded-B-Exact-Shoes-_-Search-_--_-dv%3AeCom-_-cn%3Aadidas-Brand_Expanded-B-Exact-Shoes-_-pc%3AGoogle&cm_mmc1=IN&cm_mmc2=PPC-Multiple--Multiple-Multiple-IN-EMEA-eCom-Paid_Search&gad_source=1&gclid=CjwKCAjwi_exBhA8EiwA_kU1Mr4qfK_D5twAauJbHjnIw6bd4o_8BqBss-SW0sx6VZQQHVh8fSL4LxoC8KAQAvD_BwE");
		driver.close() ;
	}
}
