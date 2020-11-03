package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="username")
	WebElement usernametxt ; 
	
	@FindBy(id="password")
	WebElement passwordtxt ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-login/div/div[1]/div[1]/div[2]/form/div[3]/dq-button/button")
	WebElement signinbtn ; 
	
	
	
	public void usercanlogin(String username , String password ) {
		
		usernametxt.click();
		usernametxt.sendKeys(username);
		
		passwordtxt.click();
		passwordtxt.sendKeys(password);
		
		signinbtn.click();
		
		
		
	}

}
