package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginobject ; 
	HomePage homeobject ;
	
	@Test
	public void logout() {
		
		homeobject = new HomePage(driver);
		homeobject.logoutmethod();
	}
	
}
