package com.test.page.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.test.base.DriverManager;

public class CheckBox {
	
	public CheckBox () {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(TextBoxPage.class);


	@FindBy(xpath="//div[@class='pattern-backgound playgound-header']")
	WebElement ValidateCheckBox;
	
	
	@FindBy()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void validateCheckBox(String validate)
	{
		Assert.assertEquals(ValidateCheckBox.getText(),validate, "page is not validate");
		log.info("page is validate "+validate);
	}
}
