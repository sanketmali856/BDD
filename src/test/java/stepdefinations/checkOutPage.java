package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.Testcontextsetup;
import io.cucumber.java.en.Then;
import pageobejectmodel.checkOutPOM;

public class checkOutPage {
	
	public WebDriver driver;
	public Testcontextsetup testcontextsetup;
	public GreencardStep greencardStep;
	public checkOutPOM checkOutPageobj;
	public checkOutPage(Testcontextsetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@Then("check add name into landing page is same or not.")
	public void check_add_pot_name_into_landing_page_is_same_or_not() throws InterruptedException {
		checkOutPageobj= testcontextsetup.pageObjectManagerObj.getcheckOutPage();
		String k= checkOutPageobj.getPoroductNameCheckoutPage();
		Assert.assertEquals(k , testcontextsetup.procuctname);

	}

}
