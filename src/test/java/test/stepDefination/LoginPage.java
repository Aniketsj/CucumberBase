package test.stepDefination;

import core.Base.DriverManager;
import core.utils.ConfigReader;
import cucumber.api.java.en.Given;
import test.pom.FrontStoreLoginPage;

public class LoginPage extends DriverManager {
	
	@Given("^User should be landing Page$")
	public void user_should_be_landing_Page() throws Throwable {
		driver= createDriver();
		String url = new ConfigReader().getProperty("url");
		driver.get(url);
		
	}
	

	@Given("^Verify page title$")
	public void pageTitle() throws Throwable {
		new FrontStoreLoginPage(driver).getTitle();
		
	}
	
	
	@Given("^User search key$")
	public void search() throws Throwable {
		new FrontStoreLoginPage(driver).enterText();		
	}
	
}
