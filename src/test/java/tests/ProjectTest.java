package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProjectPage;

public class ProjectTest extends TestBase {

	HomePage homeobject ;
	ProjectPage projectobject ;
	
	@Test
	public void addNewProject () {
		
		homeobject = new HomePage(driver);
		homeobject.NavigateToProject();
		
		projectobject = new ProjectPage(driver);
		projectobject.projectmethod();
	}
}
