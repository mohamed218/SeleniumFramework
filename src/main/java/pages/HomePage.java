package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Logout Elements
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[1]/dq-header-menu/div/div/div[3]/span[2]")
	WebElement logouticon ; 
	
	@FindBy(xpath="//*[@id=\'mat-dialog-0\']/dq-confirm-modal/div[2]/div[2]/dq-button/button")
	WebElement logoutbtn ;
	
	//New Category 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-website/div/div[4]/div/div[2]/div/dq-button/button")
	WebElement newcategorybtn ;
	
	// News Elements
	
	@FindBy(xpath="//*[@id=\'mat-expansion-panel-header-1\']/span[2]")
	WebElement aboutDqPage ; 
	
	@FindBy(xpath="//*[@id=\"cdk-accordion-child-1\"]/div/div/div[2]/dq-list-card/div/div[1]/div[2]")
	WebElement NewsTab ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-news-list/div/div[4]/div[1]/div[2]/div[2]/dq-button/button")
	WebElement Newarticlebtn ;

	// project elements 
	
	@FindBy(xpath="//*[@id=\"cdk-accordion-child-1\"]/div/div/div[2]/dq-list-card/div/div[2]/div[2]")
	WebElement projectTab ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-projects/div/div[3]/div[1]/div[2]/div/dq-button/button")
	WebElement NewProjectBtn ;
	
	public void NavigateToProject() {
		
		aboutDqPage.click();
		projectTab.click();
		NewProjectBtn.click();
	}
	
	
	public void NavigateToNews() {
		
		aboutDqPage.click();
		NewsTab.click();
		Newarticlebtn.click();
	}
	
	public void logoutmethod () {
		
		logouticon.click();
		logoutbtn.click();
	}

	public void newcategory() {
		
		newcategorybtn.click();
	}
}
