package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends PageBase {

	public ProjectPage(WebDriver driver) {
		super(driver);
	}
	
	// append strings
	String title = "Automation " ;
	String description = "Automation is the technology by which a process  is performed with minimal human assistance" ;
	String headline = "Automation Training " ; 
	String address = "Automated Address using selenium" ;
	String mobile = "11122233344" ;
	String map = "testing training " ; 
	String email = "mohamedsabry29@gmail.com" ;
	String website = "https://www.facebook.com/" ;
	
	//images' path 
	String maincover = "projectmaincover.jpg";
	String coverpath = System.getProperty("user.dir")+"/Uploads/"+ maincover;
	
	String bannerName = "projectbanner.jpg";
	String bannerpath = System.getProperty("user.dir")+"/Uploads/"+ bannerName;
	
	String secondsectionimage1 = "projectsecondimage1.jpg";
	String secondsectionuploader1 = System.getProperty("user.dir")+"/Uploads/"+ secondsectionimage1;
	
	String secondsectionimage2 = "projectsecondimage2.jpg";
	String secondsectionuploader2 = System.getProperty("user.dir")+"/Uploads/"+ secondsectionimage2;
	
	
	// finding elements 
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[1]/div[1]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement maincoverimage ; 
	
	@FindBy(xpath="//*[@id=\"titleEn\"]")
	WebElement titleentxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[1]/div[4]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement descriptionentxt ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[2]/div[1]/span[2]")
	WebElement BannerInfoTab ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[2]/div[1]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement bannerImage ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[2]/div[2]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement bannerImageAr ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[3]/div[1]/span[2]")
	WebElement firstsectionTab ;
	
	@FindBy(xpath="//*[@placeholder=\'write project title\']")
	WebElement firstsectiontitle ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[3]/div/dq-generate-control/div/dq-rich-text/quill-editor/div[2]/div[1]")
	WebElement firstsectionheadline ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[5]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement firstsectiondescription ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[7]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement firstsectionimage ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[4]/div[1]/span[2]")
	WebElement secondsectiontab ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[4]/div[1]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement firstuploader ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[4]/div[2]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement seconduploader ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[4]/div[3]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement thirduploader ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[4]/div[4]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement fourthuploader ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[4]/div[5]/div/dq-generate-control/div/dq-upload-image/div[2]/div/div[2]/input")
	WebElement fifthuploader ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[5]/div[1]/span[2]")
	WebElement thirdsectionTab ;
	
	@FindBy(id="addressEn")
	WebElement AddressEn ;
	
	@FindBy(id="mobileEn")
	WebElement mobileEn ; 
	
	@FindBy(id="mapEn")
	WebElement mapEn ; 
	
	@FindBy(id="emailEn")
	WebElement emailEn ; 
	
	@FindBy(id="websiteEn")
	WebElement websiteEn ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/div/span[2]")
	WebElement arabicTab ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[1]/dq-dynamic-stepper/div/div[1]/div/span[2]")
	WebElement maincoverTab ; 
	
	@FindBy(id="titleAr")
	WebElement titleAr ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[1]/div[5]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement descriptionAr ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[4]/div/dq-generate-control/div/dq-rich-text/quill-editor/div[2]/div[1]")
	WebElement arabicheadline ; 
	
	@FindBy(css="input[name='titleAr'][placeholder='write project title']")
	WebElement firstsectiontitleAr ;
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[6]/div/dq-generate-control/div/dq-textarea/div/div[2]/textarea")
	WebElement firstsectiondescriptionAr ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[2]/div/form/div[3]/div[4]/div/dq-generate-control/div/dq-rich-text/quill-editor/div[2]/div[1]/p")
	WebElement firstsectionheadlineAr ;
	
	@FindBy(id="addressAr")
	WebElement addressAr ; 
	
	@FindBy(xpath="/html/body/app-root/div[1]/dq-internal-layout/div/div[2]/div[3]/dq-add-edit-project/div/dq-generate-form/div/div[4]/div/div/div/button[2]")
	WebElement savebtn ; 
	
	public void projectmethod() {
		
		titleentxt.click();
		titleentxt.sendKeys(title);
		descriptionentxt.click();
		descriptionentxt.sendKeys(description + " " + description);
		maincoverimage.sendKeys(coverpath);
		BannerInfoTab.click();
		bannerImage.sendKeys(bannerpath);
		firstsectionTab.click();
		firstsectiontitle.click();
		firstsectiontitle.sendKeys(title);
		firstsectionheadline.click();
		firstsectionheadline.sendKeys(headline);
		firstsectiondescription.click();
		firstsectiondescription.sendKeys(description + " " + description);
		firstsectionimage.sendKeys(coverpath);
		secondsectiontab.click();
		firstuploader.sendKeys(secondsectionuploader1);
		seconduploader.sendKeys(secondsectionuploader2);
		thirduploader.sendKeys(secondsectionuploader2);
		fourthuploader.sendKeys(secondsectionuploader2);
		fifthuploader.sendKeys(secondsectionuploader2);
		thirdsectionTab.click();
		AddressEn.click();
		AddressEn.sendKeys(address);
		mobileEn.click();
		mobileEn.sendKeys(mobile);
		mapEn.click();
		mapEn.sendKeys(map);
		emailEn.click();
		emailEn.sendKeys(email);
		websiteEn.click();
		websiteEn.sendKeys(website);
		arabicTab.click();
		maincoverTab.click();
		titleAr.click();
		titleAr.sendKeys(title);
		descriptionAr.click();
		descriptionAr.sendKeys(description + " " + description);
		BannerInfoTab.click();
		bannerImageAr.sendKeys(bannerpath);
		firstsectionTab.click();
		firstsectiontitleAr.click();
		firstsectiontitleAr.sendKeys(title);
		firstsectiondescriptionAr.click();
		firstsectiondescriptionAr.sendKeys(description + " " + description);
		firstsectionheadlineAr.click();
		firstsectionheadlineAr.sendKeys(headline);
		thirdsectionTab.click();
		addressAr.click();
		addressAr.sendKeys(address);
		savebtn.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
