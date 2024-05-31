package ShoppersStack2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ShoppersTaskUtility2 extends ShoppersTaskBaseClass{
	@Test
	public void Task2() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[role='menuitem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click() ;
		Thread.sleep(2000) ;
		Actions a = new Actions(driver) ;
		driver.findElement(By.id("First Name")).click() ;
		for(int i=0; i<=10; i++) {
			a.keyDown(Keys.BACK_SPACE).build().perform() ;
		}
		a.keyUp(Keys.BACK_SPACE) ;
		driver.findElement(By.id("First Name")).sendKeys(ChangedFirstName) ;
		driver.findElement(By.id("Last Name")).click() ;
		for(int i=0; i<=10; i++) {
			a.keyDown(Keys.BACK_SPACE).build().perform() ;
		}
		a.keyUp(Keys.BACK_SPACE) ;
		driver.findElement(By.id("Last Name")).sendKeys(ChangedSecondName) ;
		Thread.sleep(2000) ;
		
		driver.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")).click() ;
		driver.findElement(By.xpath("//button[text()='5']")).click() ;
		driver.findElement(By.xpath("//button[text()='Jul']")).click();
		driver.findElement(By.xpath("//button[text()='2001']")).click() ;
		
		driver.findElement(By.id("Phone Number")).click() ;
		for(int i=0; i<=10; i++) {
			a.keyDown(Keys.BACK_SPACE).build().perform() ;
		}
		a.keyUp(Keys.BACK_SPACE) ;
		Thread.sleep(2000) ;
		driver.findElement(By.id("Phone Number")).sendKeys(ChangedPhoneNumber) ;
		
		WebElement countryElement = driver.findElement(By.cssSelector("select[id='Country']")) ;
		Select country = new Select(countryElement) ;
		country.selectByValue("USA") ;
		
		WebElement stateElement = driver.findElement(By.id("State")) ;
		Select state = new Select(stateElement) ;
		state.selectByIndex(2) ;
		
		WebElement CityElement = driver.findElement(By.id("City")) ;
		Select city = new Select(CityElement) ;
		city.selectByVisibleText("Oxnard") ;
		Thread.sleep(4000) ;
		driver.close() ;
	}
}
