package pageobejectmodel;

import org.openqa.selenium.WebDriver;

import Utils.Testcontextsetup;
import stepdefinations.OrangeHrmLogin;


public class pageObjectManager {
	
	public WebDriver driver;
	public landingpage landingPageObj;
	public offersPagePOM offerPageObje;
	public checkOutPOM checkOutObj;
	public naukriMainPage naukriMainPageObj;
	public NaukriDashBoard naukriDashBoardObj;
	public Testcontextsetup testcontextsetup;
	public OrangeHRMPOM OrangeHrmLoginObj;
	
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
	
	public naukriMainPage getNaukriPage() {
		naukriMainPageObj = new naukriMainPage(driver);
		return naukriMainPageObj;
	}
	
	public NaukriDashBoard getNaukriDashbaord() {
		naukriDashBoardObj = new NaukriDashBoard(driver);
		return naukriDashBoardObj;
	}

	public OrangeHRMPOM getOrangeHrmLogin() {
		OrangeHrmLoginObj = new OrangeHRMPOM(driver);
		return OrangeHrmLoginObj;
	}

}
