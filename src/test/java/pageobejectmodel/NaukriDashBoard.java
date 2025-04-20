package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.GenricUtiils;
import Utils.Testcontextsetup;

public class NaukriDashBoard {

	public WebDriver driver;
	Testcontextsetup testcontextsetup;
	
	public NaukriDashBoard(WebDriver driver) {
		
		this.driver=driver;
		//this.testcontextsetup=testcontextsetup;
	}

		By SearchBox = By.xpath("//span[contains(text(),'Search jobs here')]");
		By ProfileIcon = By.xpath("//img[contains(@alt,'naukri user profile img')]");
		By  View_Update_Profile= By.xpath("//a[contains(text(),'View & Update Profile')]");
		By Resume_headline= By.xpath("//span[contains(text(),'Resume headline')]/following-sibling::span");
		By resumeHeadlineTxtEditBox =By.id("resumeHeadlineTxt");
		By saveBtn=By.xpath("(//button[contains(text(),'Save')])[2]");
				
		
		public void resumeHeadlineTxtEdit() throws InterruptedException {
			//testcontextsetup.genricUtiils.explicitWait(driver.findElement(SearchBox));
			String serchboxtext =driver.findElement(SearchBox).getText();
			System.out.println(serchboxtext);
			Thread.sleep(2000);
			GenricUtiils.implicitwait(5, driver );
			driver.findElement(ProfileIcon).click();
			Thread.sleep(2000);
			driver.findElement(View_Update_Profile).click();
			Thread.sleep(2000);
			driver.findElement(Resume_headline).click();
			driver.findElement(resumeHeadlineTxtEditBox).click();
			Thread.sleep(2000);
			driver.findElement(resumeHeadlineTxtEditBox).sendKeys(".");
			Thread.sleep(2000);
			driver.findElement(saveBtn).click();
		}

	
}
