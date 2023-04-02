package com.test.page.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.test.base.DriverManager;

public class TextBoxPage {

	public TextBoxPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(TextBoxPage.class);

	@FindBy(id = "userName")
	private WebElement userNameInputField;

	@FindBy(id = "userEmail")
	private WebElement userEmailInputField;

	@FindBy(id = "currentAddress")
	private WebElement currentAddressInputField;

	@FindBy(id = "permanentAddress")
	private WebElement permanentAddressInputField;

	@FindBy(id = "submit")
	private WebElement submitButton;

	@FindBy(id = "name")
	private WebElement nameText;

	@FindBy(id = "email")
	private WebElement emailText;

	public void enterUsernameAs(String username) {
		userNameInputField.sendKeys(username);
		log.info("Entered username as: " + username);
	}

	public void enterUserEmailAs(String email) {
		userEmailInputField.sendKeys(email);
		log.info("Entered User Email as: " + email);
	}

	public void enterCurrentAddressInputFieldAs(String cAddress) {
		currentAddressInputField.sendKeys(cAddress);
		log.info("Entered Current Address as: " + cAddress);
	}

	public void enterPermanentAddressInputFieldInputFieldAs(String pAddress) {
		permanentAddressInputField.sendKeys(pAddress);
		log.info("Entered Permanent Address as: " + pAddress);
	}

	public void clickOnSubmitButton() {
		submitButton.click();
		log.info("Clicked on Submit Button");
	}

	public void shouldSeeNameDisplayedAs(String name) {
		Assert.assertEquals(nameText.getText(), name,
				" Enter name is not matching with Expected name: " + name);
		log.info("Verified Name as " + name);
	}

	public void shouldSeeEmailDisplayedAs(String email) {
		Assert.assertEquals(emailText.getText(), email,
				" Enter email is not matching with Expected email: " + email);
		log.info("Verified email as " + email);
	}
}
