package com.test.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static String getProperty(String key){
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("configuration.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop.getProperty(key);
	}

	public static Properties readPropertiesFile(String fileName)
			throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

	// public static void main1(String args[]) throws IOException {
	// Properties prop = readPropertiesFile("configuration.properties");
	// System.out.println("Browser: " + prop.getProperty("webdriver.driver"));
	// System.out.println("environment: " +
	// prop.getProperty("execution.environment"));
	// }

	// public static void main(String args[]) throws IOException {
	// String
	// baseUrl="https://"+getProperty("execution.environment")+".events.awana.org/";
	// System.out.println("My URL : " + baseUrl);
	// System.out.println("1: " + getProperty("webdriver.driver"));
	// System.out.println("2: " + getProperty("execution.environment"));
	// }

}
