package tests;

import org.testng.annotations.Test;

import pages.AddNewCategoryPage;
import pages.HomePage;

public class NewCategoryTest extends TestBase {

	HomePage homeobject ; 
	AddNewCategoryPage categoryobject ;
	
	@Test
	public void addcategory() {
		
		homeobject = new HomePage(driver);
		homeobject.newcategory();
		
		categoryobject = new AddNewCategoryPage(driver);
		categoryobject.AddnewCategory();
		
	}
}
