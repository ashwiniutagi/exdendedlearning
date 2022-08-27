package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  TopPage{
public WebDriver ldriver;
	
	public  TopPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//body/div[@id='__next']/div[@id='page-wrapper']/footer[@id='site-footer']/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]") 
	public WebElement top;
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']") 
	WebElement popup;
	
	public void top()
	{
		popup.click();
		top.click();
		
		
	}


}
