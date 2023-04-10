package com.test.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private WebDriver driver;
	public DriverManager driverManager;

	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driverManager = new DriverManager();
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--enable-javascript");
			options.addArguments("--incognito");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void navigateToUrl() {
		DriverManager.getDriver().get("https://demoqa.com/");
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
