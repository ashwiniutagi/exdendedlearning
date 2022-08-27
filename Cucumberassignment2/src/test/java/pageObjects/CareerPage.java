package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class   CareerPage {
public WebDriver ldriver;
	
	public   CareerPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[contains(text(),'Careers')]") 
	WebElement career;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']") 
	WebElement popup;
	
	public void career()
	{   
		popup.click();
	
		career.click();
		
	}

}




