package test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontStoreLoginPage {

	WebDriver driver;

	public FrontStoreLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "q")
	WebElement inpSearch;
	
	public void getTitle() {
		if(driver.getTitle().equals("Google")) {
			System.out.println("testingg");
		}else {
			System.out.println("false");
		}
	}
	
	public void enterText() {
		inpSearch.sendKeys("test");
	}

}
