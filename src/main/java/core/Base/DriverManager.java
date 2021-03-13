package core.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.utils.ConfigReader;

public class DriverManager {
	public static WebDriver driver;

	public WebDriver createDriver() throws IOException {
		String browserName = new ConfigReader().getProperty("browser").toUpperCase();

		switch (browserName) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		}
		driver.manage().window().maximize();
		return driver;
	}

}
