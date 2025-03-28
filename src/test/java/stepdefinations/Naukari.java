package stepdefinations;

import org.openqa.selenium.WebDriver;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Naukari {
	public WebDriver driver;
	public Testcontextsetup testcontextsetup;

	public Naukari(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("+ user is on the nakuri login page and signed in suceefully with (.+) and (.+)$")
	public void user_is_on_the_nakuri_login_page_and_signed_in_suceefully_with_sanketmali4091_gmail_com_and_sanket(String username , String password ) {
		
	}
	@When("user udpated the resume headline")
	public void user_udpated_the_resume_headline() {
		
	    
	}
	@Then("the success msg displayed")
	public void the_success_msg_displayed() {
	    
		
	}



}
