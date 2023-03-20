package com.test.practice.Shrikant_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {
	
	public static void main(String[] args) {
		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");
        
        
	}

}
