package cucumaberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Featuresfiles",glue="\\stepdefinations",monochrome=true,
tags="@OrangeHRM" ,plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scernrio.txt"})
public class TestNGrunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
