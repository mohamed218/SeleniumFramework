package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends PageBase {

	public NewsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String title = "Automation " ;
	String description = "Automation is the technology by which a process  is performed with minimal human assistance" ;
	String headline = "Automation Training " ; 
	
	String maincover = "news.png";
	String imagepath = System.getProperty("user.dir")+"/Uploads/"+ maincover;
	
	String firstsection = "First-section.jpg";
	String imagepath1 = System.getProperty("user.dir")+"/Uploads/"+ firstsection;
	
	String secondsection = "Second-section.jpg";
	String imagepath2 = System.getProperty("user.dir")+"/Uploads/"+ secondsection;
	
	String secondsectioncopy = "Second-section - Copy.jpg";
	String imagepath3 = System.getProperty("user.dir")+"/Uploads/"+ secondsectioncopy;
	
	
	@FindBy(id="dropdownBasic1")
	WebElement typedropdownlist ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[1]/div[1]/div/dq-generate-control/div/dq-dropdown/div/div/div[2]/div/div[3]")
	WebElement option ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[1]/div[2]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement browseimagebtn ;
	
	@FindBy(id="titleEn")
	WebElement titleentxt ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[1]/div[5]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement descriptiontxt ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[2]/div[1]/span[2]")
	WebElement firstsectiontab ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[2]/div[1]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement firstsectionimage ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[2]/div[2]/div/dq-generate-control/div/dq-rich-text/quill-editor/div[2]/div[1]")
	WebElement firstsectionheadline ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[2]/div[4]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement firstsectiondescriptiontxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[3]/div[1]/span[1]")
	WebElement secondsectiontab ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[3]/div/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement secondsectionimage ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[4]/div/div/div/button[2]")
	WebElement savebtn ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/div/span[2]")
	WebElement arabictab ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[1]/div[1]/span[2]")
	WebElement maincovertab ;
	
	
	@FindBy(id="titleAr")
	WebElement titleAr ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[1]/div[6]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement descriptionAr ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[2]/div[3]/div/dq-generate-control/div/dq-rich-text/quill-editor/div[2]/div[1]")
	WebElement firstsectionheadlineAr ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-news/div/dq-generate-form/div/div[2]/div/form/div[2]/div[5]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement firstsectiondescriptionAr ;
	

	
	
	public void AddNewArticle() {
		
		typedropdownlist.click();
		option.click();
		
		titleentxt.click();
		titleentxt.sendKeys(title);
		descriptiontxt.click();
		descriptiontxt.sendKeys(description);
		browseimagebtn.sendKeys(imagepath);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstsectiontab.click();
		firstsectionheadline.click();
		firstsectionheadline.sendKeys(headline);
		firstsectiondescriptiontxt.click();
		firstsectiondescriptiontxt.sendKeys(description+" "+description);
		firstsectionimage.sendKeys(imagepath1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		secondsectiontab.click();
		secondsectionimage.sendKeys(imagepath2);
		secondsectionimage.sendKeys(imagepath3);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		arabictab.click();
		maincovertab.click();
		titleAr.click();
		titleAr.sendKeys(title);
		descriptionAr.click();
		descriptionAr.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstsectiontab.click();
		firstsectionheadlineAr.click();
		firstsectionheadlineAr.sendKeys(headline);
		firstsectiondescriptionAr.click();
		firstsectiondescriptionAr.sendKeys(description+" "+ description);	
		savebtn.click();	
	}
}
