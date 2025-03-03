package stepdefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.Testcontextsetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobejectmodel.landingpage;

public class GreencardStep {
	
public WebDriver driver;
public String procuctname;
public Testcontextsetup testcontextsetup;
public GreencardStep greencardStep;

public GreencardStep(Testcontextsetup testcontextsetup) {
	
	this.testcontextsetup=testcontextsetup;
	landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
	
}
		
		@Given("the user is on the Greencht landing page")
		public void the_user_is_on_the_greencht_landing_page() throws InterruptedException, IOException {
			testcontextsetup.testBase.WebDriverManger();
			Thread.sleep(5000);
		    
		}
		@When("user is searched with shortname {string} and extract acutal name of the product")
		public void user_is_searched_with_shortname_and_extract_acutal_name_of_the_product(String shortname) throws InterruptedException {
			//landingpage landingpageobj = new landingpage(testcontextsetup.driver);
			landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
			landingpageobj.searchItems(shortname);
			acutalProductnameOnLandingPage();
			Thread.sleep(5000);
			  
		}
		
		public String acutalProductnameOnLandingPage() {
			landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
			testcontextsetup.procuctname = landingpageobj.getPoroductName().split("-")[0].trim();
			System.out.println(procuctname);  
			return procuctname;
		}
		
		@When("^user is searched with shortname (.+) and extract acutal name of the product$")
		public void user_is_searched_with_shortname_and_extract_acutal_name_of_the_product_With_data_sate(String shortname) throws InterruptedException {
			landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
			landingpageobj.searchItems(shortname);
			acutalProductnameOnLandingPage();
			Thread.sleep(5000);
		}
		

       @When("^user is searched with shortname (.+) and add the (.+).$")
       public void user_is_searched_with_shortname_pot_and_add_the_quantity(String name, int quantity ) throws InterruptedException {
    	   landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
			landingpageobj.searchItems(name);
			acutalProductnameOnLandingPage();
			landingpageobj.addQuantity(quantity);
			Thread.sleep(5000);
    
       }
       
      @When("click on add to cart then clicked proceed to check out")
      public void click_on_add_to_cart_then_clicked_proceed_to_check_out() throws InterruptedException {
    	  landingpage landingpageobj= testcontextsetup.pageObjectManagerObj.getLandingPage();
    	  landingpageobj.addTocart();
    	  landingpageobj.procedToccheckout();
       }
		
		

}
