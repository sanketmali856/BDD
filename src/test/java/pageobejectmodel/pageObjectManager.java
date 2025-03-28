package pageobejectmodel;

import org.openqa.selenium.WebDriver;


public class pageObjectManager {
	
	public WebDriver driver;
	public landingpage landingPageObj;
	public offersPagePOM offerPageObje;
	public checkOutPOM checkOutObj;
	
	public pageObjectManager(WebDriver driver) {
		this.driver= driver;
	}
	
	public landingpage getLandingPage() {
		landingPageObj = new landingpage(driver);
		return landingPageObj;
	}
	
	public offersPagePOM getOffersPage() {
		offerPageObje = new offersPagePOM(driver);
		return offerPageObje;
	}
	
	public checkOutPOM getcheckOutPage() {
		checkOutObj = new checkOutPOM(driver);
		return checkOutObj;
	}
	
	

}
