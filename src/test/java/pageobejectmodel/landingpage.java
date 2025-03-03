package pageobejectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingpage {
	public WebDriver driver;

	public landingpage(WebDriver driver){
		this.driver=driver;
	}

	By search=  By.xpath("//input[@class='search-keyword']");
	By productname  =By.xpath("//h4[@class=\"product-name\"]");
	By clickTopDeals = By.xpath("//a[contains(text(),'Top Deals')]");
	By addQantity= By.xpath("//a[@class='increment']");
	By addToCart = By.xpath("//button[contains(text(), 'ADD TO CART')]");
	By cartIcon =By.xpath("//a[@class='cart-icon']");
	By procedToclick=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public void searchItems(String shortname) throws InterruptedException {
		driver.findElement(search).sendKeys(shortname);
		Thread.sleep(8000);
	}
	
	public String getPoroductName () {
		 return driver.findElement(productname).getText();
	}
	
	public void selectTopDeals () {
		driver.findElement(clickTopDeals).click();
	}
	
	public void addQuantity (int i) {
		for(int j=0 ; j<i-1; j++) {
			driver.findElement(addQantity).click();
		}
	}
	
	public void addTocart () {
		driver.findElement(addToCart).click();
	}
	
	public void procedToccheckout () throws InterruptedException {
		driver.findElement(cartIcon).click();
		Thread.sleep(2000);
		driver.findElement(procedToclick).click();
		Thread.sleep(8000);
	}
	public void TetsingGit () {
		
	}
}
