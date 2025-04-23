package pageobejectmodel;

import org.apache.poi.sl.usermodel.PaintStyle.SolidPaint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//import com.aventstack.extentreports.util.Assert;

import Utils.GenricUtiils;
import Utils.Testcontextsetup;
import org.testng.Assert;




public class OrangeHRMPOM {

		public WebDriver driver;
		Testcontextsetup testcontextsetup;
	
		public OrangeHRMPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

		By invalidError= By.xpath("//*[text()='Invalid credentials']");

		@FindBy(xpath = "//input[@name='username']")
		private WebElement Username_textBox;

		@FindBy(xpath = "//*[@name='password']")
    	private WebElement passwordTextBox;

		@FindBy(xpath ="//*[@type='submit']")
		private WebElement login_Button;

		@FindBy(xpath ="//h6[text()='Dashboard']")
		private WebElement dashbaordHeading;
			
		
		public void loginPage()  {
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			GenricUtiils.implicitwait(5, driver);
		}

		public void orangeHrmLogin(String username , String password) throws InterruptedException {
			Username_textBox.sendKeys(username);
			Thread.sleep(4000);
			passwordTextBox.sendKeys(password);
		} 

		public void login_Button_Click() throws InterruptedException{
			login_Button.click();
			Thread.sleep(4000);
		}

		public void dashbaordHeading_visible(){
			GenricUtiils.explicitWait(dashbaordHeading, driver);
			Assert.assertTrue(dashbaordHeading.isDisplayed(), "Dashboard not visible!");
			try {
				Assert.assertEquals(dashbaordHeading.getText(), "Dashboard");
				System.out.println("Dashboard is visible and logged in successifully ");
			} catch (Exception e) {
				System.out.println("Dashboard not visible!");
			}
		}

		public void invalid_Error_Validation(String msg){
			try{
			Assert.assertTrue(driver.findElement(invalidError).isDisplayed(),"Invalid username and password");
			System.out.println("Invalid username and password enterd");
			}
			catch(Exception e){
				Assert.fail();
			}
		}
}
