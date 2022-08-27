package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  ContactPage {
public WebDriver ldriver;
	
	public  ContactPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[contains(text(),'Contact Us')]") 
	WebElement contact;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
	public 	WebElement popup;
	public void contact()
	{
		popup.click();
		contact.click();
		
	}
	
}


