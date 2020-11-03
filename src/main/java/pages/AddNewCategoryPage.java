package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCategoryPage extends PageBase {

	public AddNewCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String imagename = "seleniumimage.png";
	String imagepath = System.getProperty("user.dir")+"/Uploads/"+ imagename;
	
	@FindBy(id="categoryTitle")
	WebElement categorytitletxt ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/span")
	WebElement tagsbtn ;
	
	@FindBy(id="First Tag")
	WebElement firstTagTxt ; 
	
	@FindBy(id="Second Tag")
	WebElement secondtagtxt ;
	
	@FindBy(className="add-new-subsection-header-title")
	WebElement addtagbtn ; 
	
	@FindBy(id="Third Tag")
	WebElement thirdtagtxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/span")
	WebElement subcategorybtn ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[2]/div[3]/form/div/div/div[1]/dq-upload-image/div[2]/div/div[2]/input")
	WebElement browseimagebtn ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[2]/div[3]/form/div/div/div[2]/input")
	WebElement subcategorytxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[4]/div[2]/button[2]")
	WebElement savebtn ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[2]/span[2]")
	WebElement arabictab ; 
	
	@FindBy(id="categoryTitleAr")
	WebElement categoryTitleArtxt ;
	
	@FindBy(id="First TagAr")
	WebElement FirstTagArtxt ;
	
	@FindBy(id="Second TagAr")
	WebElement SecondTagArtxt ;
	
	@FindBy(id="Third TagAr")
	WebElement ThirdTagArtxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[2]/div[3]/form/div/div/div[3]/input")
	WebElement subcategoryArTxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-category/div/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/span")
	WebElement categorytab ;
	
	public void AddnewCategory() {
		
		categorytitletxt.click();
		categorytitletxt.sendKeys("automation");
		tagsbtn.click();
		firstTagTxt.click();
		firstTagTxt.sendKeys("first-tag");
		secondtagtxt.click();
		secondtagtxt.sendKeys("second-tag");
		addtagbtn.click();
		thirdtagtxt.click();
		thirdtagtxt.sendKeys("third-tag");
		subcategorybtn.click();
		//browseimagebtn.click();
		browseimagebtn.sendKeys(imagepath);
		subcategorytxt.click();
		subcategorytxt.sendKeys("automated");
		arabictab.click();
		categorytab.click();
		categoryTitleArtxt.click();
		categoryTitleArtxt.sendKeys("automatedAR");
		tagsbtn.click();
		FirstTagArtxt.click();
		FirstTagArtxt.sendKeys("first-arabic");
		SecondTagArtxt.click();
		SecondTagArtxt.sendKeys("second-arabic");
		ThirdTagArtxt.click();
		ThirdTagArtxt.sendKeys("third-arabic");
		subcategorybtn.click();
		subcategoryArTxt.click();
		subcategoryArTxt.sendKeys("subcat-arabic");
		savebtn.click();
		
		
		
		
		
		
	}
	
}
