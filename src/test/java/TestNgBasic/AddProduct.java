package TestNgBasic;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddProduct extends BaseClass{	
		@Test
		public void Test(){
			driver.findElement(By.xpath("//input[@name='updatecart']")).click() ;
		}
}
