package pageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  OurPage {
public WebDriver ldriver;
	
	public  OurPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Our Commitment')]") 
	public WebElement our;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
	public 	WebElement popup;
	
	public void our ()
	{
		popup.click();
	our.click();
	
	
	}

}

