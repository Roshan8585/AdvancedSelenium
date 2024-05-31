package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder2 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite") ;
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest") ;
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass") ;
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod") ;
	}
	@Test
	public void Test1() {
		System.out.println("TestCase1") ;
	}
	@Test
	public void Test2() {
		System.out.println("TestCase2") ;
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod") ;
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass") ;
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest") ;
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite") ;
	}
}