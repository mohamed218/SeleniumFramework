package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class TestBase {

	public static WebDriver driver ; 
	LoginPage loginobject ; 
	
	@BeforeSuite
	public void startdriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://40.121.137.251:8086/login");
	}
	
	@BeforeSuite
public void usercanlogin() {
		
		loginobject = new LoginPage(driver);
		loginobject.usercanlogin("sabry", "Sabry@123");
	}
}