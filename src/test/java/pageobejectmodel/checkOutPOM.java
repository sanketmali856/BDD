package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOutPOM {

	public WebDriver driver;

	public checkOutPOM(WebDriver driver){
		this.driver=driver;
	}
	
	By ProductAtchekout =  By.xpath("//p[@class='product-name']");
	
	public String getPoroductNameCheckoutPage () throws InterruptedException {
		 Thread.sleep(5000);
		 String porodutNameAtcheckout=  driver.findElement(ProductAtchekout).getText().split("-")[0].trim();
		 System.out.println(porodutNameAtcheckout);
		 System.out.println("New Change for testing");
		 return porodutNameAtcheckout;
	}
}
