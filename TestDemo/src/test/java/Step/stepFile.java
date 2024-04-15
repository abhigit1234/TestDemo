package Step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.base;
import POM.pomodel;
import Utilities.readConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class stepFile extends base {
	@Before
	public void browserSetup() {
		rc = new readConfig();
		switch (rc.getBrowser()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
	}

	@After
	public void tearDown(Scenario s) {
		if (s.isFailed()) {
			byte[] arr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			s.attach(arr, "image/png", s.getName());
		}
		driver.close();
	}

	@Given("user launch browser")
	public void user_launch_browser() {
		pom = new pomodel(driver);
	}

	@When("user launches url as {string}")
	public void user_launches_url_as(String url) {
		driver.get(rc.geturl());
	}

	@Then("user enter username as {string}")
	public void user_enter_username_as(String username) {
		pom.setUname(username);
	}

	@Then("user enter password as {string}")
	public void user_enter_password_as(String password) {
		pom.setpswd(password);
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password(DataTable d) {
		List<Map<String, String>> map = d.asMaps();
		pom.setUname(map.get(0).get("username"));
		pom.setpswd(map.get(0).get("password"));

	}

	@Then("user enter username,password")
	public void user_enter_username_password(DataTable d) {
		Map<String, String> map = d.asMap();
		pom.setUname(map.get("username"));
		pom.setpswd(map.get("password"));
	}

	@Then("click on login button")
	public void click_on_login_button() {
		pom.clk();
	}

	@Then("verify  as {string}")
	public void verify_login_as(String exp) {
		pom.verify(exp);

	}

}
