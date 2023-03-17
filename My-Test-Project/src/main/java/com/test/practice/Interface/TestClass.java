package com.test.practice.Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	static InterfaceTest2 interfaceTest;
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		//fwdf
		//afafa
		
		driver= new FirefoxDriver();
		
		//fwdf
		//afafa
		
		
		interfaceTest = new ClassImpl1();
		interfaceTest.calculateSalary();
		
		
		interfaceTest = new ClassImpl2();
		interfaceTest.calculateSalary();

	}

}
