package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobejectmodel.pageObjectManager;
import stepdefinations.GreencardStep;

public class Testcontextsetup {

	public WebDriver driver;
	public String procuctname;
	public String prouctnameonoffer;
	public pageObjectManager pageObjectManagerObj;
	public TestBase testBase;
	public GenricUtiils genricUtiils;
	public String porodutNameAtcheckout;

	
	public Testcontextsetup() throws IOException {
		 testBase = new TestBase();
		 pageObjectManagerObj = new pageObjectManager(testBase.WebDriverManger());
		 genricUtiils = new GenricUtiils(testBase.WebDriverManger());
		 
	}
}