package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

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
	

}
