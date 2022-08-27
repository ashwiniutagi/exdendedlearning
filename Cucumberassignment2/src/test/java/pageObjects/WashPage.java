package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  WashPage {
public WebDriver ldriver;
	
	public  WashPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[contains(text(),'How to Wash Clothes')]") 
	WebElement wash;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']") 
	WebElement popup;
	
	public void wash()
	{
		popup.click();
		wash.click();
		
	}

}

