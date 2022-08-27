package pageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Excel;

public class   SearchPage{
public WebDriver ldriver;
	
	public  SearchPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/input") 
	public WebElement search;
	public Excel  excel=new Excel();
	public void search()
	{
		search.sendKeys(excel.getStringData(0, 0, 0)+Keys.ENTER);
	}



}
