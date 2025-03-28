package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class naukriMainPage {

    WebDriver driver;

	public naukriMainPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginButton = By.xpath("//a[contains(text(),'Login')]");
	By emailIdEditBox = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By passwordEditBox = By.xpath("//input[@placeholder='Enter your password']");
	By finalLgoinButton =By.xpath("//button[@type='submit']");
	
	public void loginFunction(String username , String password ) {
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(loginButton).click();
		driver.findElement(emailIdEditBox).sendKeys(username);
		driver.findElement(passwordEditBox).sendKeys(password);
		driver.findElement(loginButton).click();
		
	}

}
