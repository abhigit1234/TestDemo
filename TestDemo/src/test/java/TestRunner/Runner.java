package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/rrr.feature",
				glue = "Step",
				tags = "@tag1",
				dryRun = false,
				monochrome = true,
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
	/*
	 * @ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value
	 * = "false")
	 * 
	 * @ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value =
	 * "pretty,json:Reports/one.json,html:Reports/two.html,junit:Reports/three.xml")
	 * 
	 * @ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "")
	 * 
	 * @ConfigurationParameter(key =
	 * Constants.EXECUTION_MODE_FEATURE_PROPERTY_NAME,value = "concurrent")
	 * 
	 * @ConfigurationParameter(key =
	 * Constants.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME,value = "true")
	 * //------------This is compulsory for parallel scenarios----------------
	 * 
	 * @ConfigurationParameter(key =
	 * Constants.PARALLEL_CONFIG_STRATEGY_PROPERTY_NAME,value = "fixed")
	 * 
	 * @ConfigurationParameter(key =
	 * Constants.PARALLEL_CONFIG_FIXED_MAX_POOL_SIZE_PROPERTY_NAME,value = "2")
	 * 
	 * @ConfigurationParameter(key =
	 * Constants.PARALLEL_CONFIG_FIXED_PARALLELISM_PROPERTY_NAME,value = "2")
	 */

	

