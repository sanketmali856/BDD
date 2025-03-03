package stepdefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.Testcontextsetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobejectmodel.landingpage;
import pageobejectmodel.offersPagePOM;
import pageobejectmodel.pageObjectManager;



public class offerspage {
	Testcontextsetup testcontextsetup;
	offersPagePOM offerspageobj;
	pageObjectManager pageObjectManagerObj9;
	public static String prouctnameonoffer;
	
	
	public offerspage(Testcontextsetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	

		@Then("user searched {string} short name into the offers page to check the product is avilable or not.")
		public void user_searched_same_short_name_into_the_offers_page_to_check_the_product_is_avilable_or_not(String name) throws InterruptedException {
		switchToOffersPage();
		Thread.sleep(5000);
		offersPagePOM offerspageobj = testcontextsetup.pageObjectManagerObj.getOffersPage();
		//offersPagePOM offerspageobj = new offersPagePOM(testcontextsetup.driver);
		offerspageobj.searchItems(name);
		Thread.sleep(5000);
		}
		
		@Then("^user searched (.+) short name into the offers page to check the product is avilable or not.$")
		public void user_searched_same_short_name_into_the_offers_page_to_check_the_product_is_avilable_or_not_WithData_Set(String name) throws InterruptedException {
		switchToOffersPage();
		Thread.sleep(5000);
		offersPagePOM offerspageobj = testcontextsetup.pageObjectManagerObj.getOffersPage();
		//offersPagePOM offerspageobj = new offersPagePOM(testcontextsetup.driver);
		offerspageobj.searchItems(name);
		Thread.sleep(5000);
		}
		
		public void switchToOffersPage() throws InterruptedException {
			//pageObjectManager pageObjectManagerObj = new pageObjectManager(testcontextsetup.driver);
			landingpage landingpageObj= testcontextsetup.pageObjectManagerObj.getLandingPage();		
			landingpageObj.selectTopDeals();
			Thread.sleep(5000);
			testcontextsetup.genricUtiils.windowSwitchToChild();
			Thread.sleep(5000);
			
		}
		
		@And("verify both name are same or not")
		public void verify_both_name_are_same_or_not() throws InterruptedException{
			offerspageobj = testcontextsetup.pageObjectManagerObj.getOffersPage();
		    prouctnameonoffer= offerspageobj.getPoroductNameOnOfferPage();
			Thread.sleep(3000);
			Assert.assertEquals(prouctnameonoffer, testcontextsetup.procuctname);
		}


}
