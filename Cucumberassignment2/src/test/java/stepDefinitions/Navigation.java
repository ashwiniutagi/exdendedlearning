package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Utility.ReadConfiguration;
import Utility.snaps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ShopPage;
import pageObjects.TermsPage;
import pageObjects.TopPage;
import pageObjects.WashPage;
import pageObjects.CareerPage;
import pageObjects.ContactPage;
import pageObjects.CoupensPage;
import pageObjects.OurPage;
import pageObjects.PrivacyPage;
import pageObjects.SearchPage;


public class Navigation {
	WebDriver driver;
	public static Logger log;
	ShopPage s;
	
	ReadConfiguration rc=new ReadConfiguration();
	
	@Given("user launch browser")
	public void user_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Cucumberassignment2\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		log=Logger.getLogger("Tide");
	    PropertyConfigurator.configure("Log4j.properties");
		log.info("hrome started succesfully");
		
	} 

	@When("user open url")
	public void user_open_url() throws IOException{
		s=new ShopPage(driver);
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		snaps.getScreenshot(driver, "Website");
	   
	}

	

	@And("clicks on shop products")
	public void clicks_on_shop_products()throws IOException, InterruptedException {
		s.shop();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "shop products");
		
	   
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
		log.info("browser closed successfully");
	   
	}
	
	@And("clicks on our commitment")
	public void clicks_on_our_commitment()throws IOException, InterruptedException {
		OurPage o=new OurPage(driver);
		o.our();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "our commitment");
		
	   
	}
	@And("clicks on  How to Wash Clothes")
	public void clicks_on_How_to_Wash_Clothes()throws IOException, InterruptedException {
		WashPage w=new WashPage(driver);
		w.wash();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "Wash Clothes");
		
	   
	}
	
	@And("clicks on  Contact Us")
	public void clicks_on_Contact_Us()throws IOException, InterruptedException {
		ContactPage c=new ContactPage(driver);
		c.contact();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "Contact Us");
		
	   
	}
	@And("search for cloth")
	public void search_for_cloth()throws IOException, InterruptedException {
		SearchPage s=new SearchPage(driver);
		s.search();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "cloth");
		
	   
	}
	
		
	   
	@And("clicks on Terms and Conditions")
	public void clicks_on_Terms_and_Conditions()throws IOException, InterruptedException {
		TermsPage t=new TermsPage(driver);
		t.terms();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "Terms and Conditions");
		
	}
	@And("clicks on Coupens and Rewards")
	public void clicks_on_Coupens_and_Rewards()throws IOException, InterruptedException {
		CoupensPage c=new CoupensPage(driver);
		c.coupens();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "Coupens and Rewards");
		
	}
	 @And("^clicks on Tide Simply$")
	    public void clicks_on_tide_simply() throws Throwable {
	       TopPage t=new TopPage(driver);
	       t.top();
	       Thread.sleep(3000);
			snaps.getScreenshot(driver, "Tide Simply");
	    }
	 @And("^clicks on Privacy$")
	    public void clicks_on_privacy() throws Throwable {
		 PrivacyPage p=new PrivacyPage(driver);
	       p.privacy();
	       Thread.sleep(3000);
			snaps.getScreenshot(driver, "Privacy");
	    }
	  @And("^clicks on  Careers$")
	    public void clicks_on_careers() throws Throwable {
		  CareerPage c=new CareerPage(driver);
	      c.career();
	      Thread.sleep(3000);
			snaps.getScreenshot(driver, "Careers");
	    }

}
