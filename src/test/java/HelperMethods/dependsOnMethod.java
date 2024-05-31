package HelperMethods;

import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test
	public void createAccount() {
		System.out.println("Account has been created");
	}
	@Test()
	public void modifyAccount() {
		System.out.println("Account has been modified") ;
	}
	@Test(priority = 0, dependsOnMethods = "createAccount")
	public void deteleAccount() {
		System.out.println("Account has been deleted") ;
	}
}
