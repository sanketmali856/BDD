package stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utils.Testcontextsetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	Testcontextsetup testcontextsetup;
	
	public Hooks(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testBase.WebDriverManger().close();
		testcontextsetup.testBase.WebDriverManger().quit();
		
	}
	
	@Before
     public void BeforeScenario() {
		//code that you want run before all the feature file.
		
	}
	
	@AfterStep
	public void TakescreenshoS(Scenario scenario ) throws IOException {
		WebDriver driver =testcontextsetup.testBase.WebDriverManger();
		if(scenario.isFailed()) {
			File Sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(Sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}  
		
	}
	

}
