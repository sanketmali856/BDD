package stepdefinations;

import org.openqa.selenium.WebDriver;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobejectmodel.NaukriDashBoard;
import pageobejectmodel.naukriMainPage;

public class Naukari {
	public WebDriver driver;
	public Testcontextsetup testcontextsetup;
	public naukriMainPage naukriMainPageObj;
	public NaukriDashBoard naukriDashBoardObj;

	public Naukari(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("^user is on the nakuri login page and signed in suceefully with (.+) and (.+)$")
	public void user_is_on_the_nakuri_login_page_and_signed_in_suceefully_with_sanketmali4091_gmail_com_and_sanket(String username , String password ) throws InterruptedException {
		naukriMainPageObj=testcontextsetup.pageObjectManagerObj.getNaukriPage();
		naukriMainPageObj.loginFunction(username, password);
		
	}
	@When("user udpated the resume headline")
	public void user_udpated_the_resume_headline() throws InterruptedException {
		naukriDashBoardObj=testcontextsetup.pageObjectManagerObj.getNaukriDashbaord();
		naukriDashBoardObj.resumeHeadlineTxtEdit();
	    
	}
	@Then("the success msg displayed")
	public void the_success_msg_displayed() {
	    System.out.println("cool");
		
	}



}
