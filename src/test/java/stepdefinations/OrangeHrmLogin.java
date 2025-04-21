package stepdefinations;

import org.openqa.selenium.WebDriver;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobejectmodel.OrangeHRMPOM;

public class OrangeHrmLogin {
    public WebDriver driver;
	public Testcontextsetup testcontextsetup;
    public OrangeHRMPOM OrangeHrmLoginObj;

    public OrangeHrmLogin(Testcontextsetup testcontextsetup){
        this.testcontextsetup=testcontextsetup;
    }

    @Given("User is on the OrangeHRM login page")
    public void user_is_on_the_orange_hrm_login_page() {
        OrangeHrmLoginObj = testcontextsetup.pageObjectManagerObj.getOrangeHrmLogin();
        OrangeHrmLoginObj.loginPage();
        
    }

    @When("^User enters valid (.+) and (.+)$")
    public void user_enters_valid_admin_and_admin123(String username , String password) throws InterruptedException {
        OrangeHrmLoginObj.orangeHrmLogin(username, password);
    }


@When("Clicks on the login button")
public void clicks_on_the_login_button() {
    
}
@Then("User should be navigated to the dashboard page")
public void user_should_be_navigated_to_the_dashboard_page() {
    
}
    

}
