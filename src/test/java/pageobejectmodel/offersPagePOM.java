package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPagePOM {
	public WebDriver driver;

	public offersPagePOM(WebDriver driver){
		this.driver=driver;
	}

	By search=  By.id("search-field");
	By prouctnameonoffer =By.xpath("(//tbody/tr/td)[1]");
	
	
	public void searchItems(String name) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(search).sendKeys(name);
	}
	
	public String getPoroductNameOnOfferPage () throws InterruptedException {
		 Thread.sleep(5000);
		 String pname=  driver.findElement(prouctnameonoffer).getText();
		 System.out.println(pname);
		 return pname;
	}
	
	
}
