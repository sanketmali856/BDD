package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaukariPage {

	WebDriver driver;
	
	public NaukariPage(WebDriver driver) {
		this.driver=driver;
	}
	By cool =  By.xpath("//p[@class='product-name']");
	
	public void nakukariupdate() {
		
		
	}

}
