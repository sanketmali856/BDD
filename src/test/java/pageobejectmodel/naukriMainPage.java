package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Testcontextsetup;

public class naukriMainPage {

    WebDriver driver;
    Testcontextsetup testcontextsetup;

	public naukriMainPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginButton = By.xpath("//a[contains(text(),'Login')]");
	By emailIdEditBox = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By passwordEditBox = By.xpath("//input[@placeholder='Enter your password']");
	By finalLgoinButton =By.xpath("//button[@type='submit']");
	//By SearchBox = By.xpath("//span[contains(text(),'Search jobs here')]");
	
	public void loginFunction(String username , String password ) throws InterruptedException {
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(loginButton).click();
		Thread.sleep(2000);
		driver.findElement(emailIdEditBox).sendKeys(username);
		driver.findElement(passwordEditBox).sendKeys(password);
		driver.findElement(finalLgoinButton).click();
		Thread.sleep(3000);
		
	}

}
