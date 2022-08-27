package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  PrivacyPage {
public WebDriver ldriver;
	
	public  PrivacyPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//body/div[@id='__next']/div[@id='page-wrapper']/footer[@id='site-footer']/div[2]/div[1]/div[5]/div[1]/div[3]/a[1]") 
	WebElement privacy;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']") 
	WebElement popup;
	public void privacy()
	{
		popup.click();
		privacy.click();
		
		
	}



}
