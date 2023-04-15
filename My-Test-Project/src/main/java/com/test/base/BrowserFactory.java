package com.test.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.utilities.PropertiesReader;

public class BrowserFactory {

	private WebDriver driver;
	public DriverManager driverManager;

	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driverManager = new DriverManager();
			System.setProperty("webdriver.chrome.driver",
					PropertiesReader.getProperty("webdriver.chrome.driver"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--enable-javascript");
			options.addArguments("--incognito");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					PropertiesReader.getProperty("webdriver.firefox.driver"));
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					PropertiesReader.getProperty("webdriver.edge.driver"));
			driver = new EdgeDriver();
		}
		driverManager.setDriver(driver);
		DriverManager.getDriver().get("https://demoqa.com/");
		DriverManager.getDriver().manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void navigateToUrl() {
		// String
		// baseUrl="https://"+getProperty("execution.environment")+".events.awana.org/";
		DriverManager.getDriver().get("https://demoqa.com/");
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
