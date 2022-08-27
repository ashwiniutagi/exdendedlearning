package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  TermsPage{
public WebDriver ldriver;
	
	public  TermsPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]") 
	public WebElement terms;
	//@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
	//public 	WebElement popup;
	public void terms()
	{
		terms.click();
		//popup.click();
	}
}

