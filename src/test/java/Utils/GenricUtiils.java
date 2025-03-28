package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenricUtiils {
	public WebDriver driver;
	
	public GenricUtiils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void windowSwitchToChild() throws InterruptedException {
		Set<String> window =driver.getWindowHandles();
		
		   Iterator <String> it = window.iterator();
		   String parent = it.next();
		   String child =it.next();
		   driver.switchTo().window(child);
		   Thread.sleep(5000);
		   //driver.switchTo().window(parent);
	}
	
	public void alertAccept() {
		Alert al =driver.switchTo().alert();
		al.accept();
	}
	
	public void alertDismiss() {
		Alert al =driver.switchTo().alert();
		al.dismiss();
	}
	public void alertSendKeys(String str) {
		Alert al =driver.switchTo().alert();
		al.sendKeys(str);;
	}
	
	public void dropDownSelectByValue(WebElement wb, String str) {
		Select sc= new Select(wb);
		sc.selectByValue(str);
	}
	public void dropDownSelectByVisibleText(WebElement wb, String str) {
		Select sc= new Select(wb);
		sc.selectByVisibleText(str);
	}
	
	public void dropDownSelectByIndex(WebElement wb, int index) {
		Select sc= new Select(wb);
		sc.selectByIndex(index);
	}
	
	public void dragAndDrop(WebElement source , WebElement des) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, des).build().perform();
	}
	
	public void scrollBy(int upside ,int downside) {
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(argument[0],argument[1])",upside,downside);
	}
	
	public void scrollIntoTheView(WebElement wb) {
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)",wb);
	}

}
