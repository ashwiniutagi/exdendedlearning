package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
public WebDriver ldriver;
	
	public ShopPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(linkText="Shop Products")
	public 	WebElement shop;
	@FindBy(xpath="//*[@id=\"lilo3746-wrapper\"]/div/a")
	public 	WebElement popup;
	
	
	public void shop()
	{    
		
	 popup.click();
		shop.click();
		
	}

}
