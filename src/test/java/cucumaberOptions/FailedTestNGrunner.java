package cucumaberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scernrio.txt",glue="\\stepdefinations",monochrome=true,
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class FailedTestNGrunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
