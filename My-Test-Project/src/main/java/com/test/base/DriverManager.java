package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import io.cucumber.core.exception.CucumberException;
import io.cucumber.java.Scenario;

public class DriverManager {

	private static WebDriver driver;
	private static CommonUtilities commonUtilities;
//	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static ThreadLocal<Scenario> scenario = new ThreadLocal<>();

	public static WebDriver getDriver() {
		WebDriver session = driver;
		if (session != null) {
			return session;
		}
		throw new WebDriverException("Webdriver Instance is not found");
	}

	public void setDriver(WebDriver dr) {
		driver = dr;
	}

	public static CommonUtilities getCommonUtilities() {
		return commonUtilities;
	}

	public static void setCommonUtilities(CommonUtilities objWrapperClass) {
		commonUtilities = objWrapperClass;
	}

	public static Scenario getScenario() {
		Scenario currentScenario = scenario.get();
		if (currentScenario != null) {
			return currentScenario;
		}
		throw new CucumberException("Cucumber Scenario Instance is not found");
	}

	public static void setScenario(Scenario scenarios) {
		scenario.set(scenarios);
	}

	public void removeScenario() {
		scenario.remove();
	}
}
