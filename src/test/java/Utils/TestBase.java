package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManger() throws IOException
	{	
		FileInputStream fie = new FileInputStream((System.getProperty("user.dir"))+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fie);
		String url= prop.getProperty("QAUrl");
		if(driver==null)   
		{
			
			if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
			{
		 System.setProperty("webdriver.chrome.driver", ((System.getProperty("user.dir"))+"\\src\\test\\resources\\chromedriver.exe")); 
		 //WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(); 
		 driver.manage().window().maximize(); 
			}
			if(prop.getProperty("Browser").equalsIgnoreCase("FireFox"))
			{
				//firfox code.
			}
		 driver.get(url);
		}
		 return driver;
	}
}
