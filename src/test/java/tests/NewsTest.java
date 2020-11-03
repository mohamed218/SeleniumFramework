package tests;


import org.testng.annotations.Test;

import pages.HomePage;
import pages.NewsPage;

public class NewsTest extends TestBase {

	HomePage homeobject ; 
	NewsPage newsobject ; 
	
	@Test
	public void AddNewArticle() {
				
		homeobject = new HomePage(driver);
		homeobject.NavigateToNews();
		
		newsobject = new NewsPage(driver);
		newsobject.AddNewArticle();
		
	}
}
