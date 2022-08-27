package pageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoupensPage {
public WebDriver ldriver;
	
	public  CoupensPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Coupons and Rewards')]") 
	public WebElement coupens;
	@FindBy(xpath="//*[@id=\"lilo3746-wrapper\"]/div/a")
	public 	WebElement popup;
	
	public void coupens ()
	{
		popup.click();
	coupens.click();
	
	
	}




}
