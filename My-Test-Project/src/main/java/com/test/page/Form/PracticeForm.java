package com.test.page.Form;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.test.base.CommonUtilities;
import com.test.base.DriverManager;
import com.test.page.elements.TextBoxPage;

public class PracticeForm {
	
	public PracticeForm() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(PracticeForm.class);

	@FindBy(xpath="//img[@src='/images/Toolsqa.jpg']")
	WebElement vartoolsQA;

	@FindBy(id = "firstName")
	WebElement FirstNameInputField;

	@FindBy(id = "lastName")
	WebElement LastNameInputField;

	@FindBy(id = "userEmail")
	WebElement EmailInputField;

	@FindBy(xpath = "//input[@value='Male']")
	WebElement selectOnMale;

	@FindBy(id = "userNumber")
	WebElement enterMobileNo;

	@FindBy(id = "dateOfBirthInput")
	WebElement clickDOB;

	@FindBy(xpath = "//div[@class='react-datepicker']")
	WebElement calender;

	@FindBy(xpath = "//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	WebElement enterSubject;

	@FindBy(xpath = "//input[@id='hobbies-checkbox-1']/parent::div/label")
	WebElement selectHobi;

	@FindBy(xpath ="//input[@class='form-control-file']")
	WebElement chooseFile;

//	@FindBy(id = "")
//	WebElement navigatelocal; // problem
//
//	@FindBy(id = "")
//	WebElement selectLocalAndUplode; // problem

	@FindBy(id = "currentAddress")
	WebElement currentAddress;

	@FindBy(xpath = "//div[contains(text(),'Select State')]")
	WebElement clickstate;

	@FindBy(xpath = "//div[contains(text(),'Haryana')]")
	WebElement SelectState;

	@FindBy(xpath="//div[contains(text(),'Select City')]")
	WebElement ClickCity;
	
	
	@FindBy(xpath="//div[contains(text(),'Panipat')]")
	WebElement SelectCity;
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitButton;
	
	
	@FindBy(xpath="//div[@id='example-modal-sizes-title-lg']")
	WebElement navSubmitionForm;
	
	@FindBy(xpath="//div[contains(text(),'Thanks for submitting the form')]")
	WebElement verifySubmitionForm;
	
	@FindBy(id="closeLargeModal")
	WebElement closeButton;
	
	
	public void verifyTheTitleOfPage()  {
		String ss=vartoolsQA.getText();
		Assert.assertEquals(ss,"DEMOQA","wertyui");
		
	}

	public void firstName(String fname) {
		FirstNameInputField.sendKeys(fname);
		log.info("entered first name as " + fname);
	}

	public void lastName(String lname) {
		LastNameInputField.sendKeys(lname);
		log.info("enter last name as  " + lname);

	}

	public void emailAdress(String mail) {
		EmailInputField.sendKeys(mail);
		log.info(" enter email as  " + mail);
	}

	public void selectGenderAsMale() {
		selectOnMale.click(); // doubtfull locator
	}

	public void enterMobileNo(String no) {
		enterMobileNo.sendKeys(no);
		log.info("enterd mobilde no" + no);
	}

	public void enterDateOfBirth(String dob) {
		clickDOB.sendKeys(dob);
		log.info("enterd mobile no is " + dob);
	}

	public void navigateCalener() {
		String textOfCalendr = calender.getText();
		log.info("this is text of calender " + textOfCalendr);
	}

	public void enterSubject(String subject) {
		enterSubject.sendKeys(subject);
		log.info("enterd subject is " + subject);
	}

	public void selectHobies() {
		selectHobi.click();
	}

	public void ChooseFile() throws InterruptedException {
		WebElement ele=chooseFile;
		Actions act= new Actions(DriverManager.getDriver());
	     act.moveToElement(ele);
	     act.build().perform();
	     Thread.sleep(2000);
	     act.click();
	     act.build().perform(); 
	     Thread.sleep(2000);
		  ele.sendKeys("C:\\Users\\ADMIN\\Downloads\\fileeee");
	}

//	public void userNavigareInLocal() {
//
//	}
//
//	public void userSelectFileAndUplode() {
//
//	}

	public void userEntersCurrentAddress(String Cadd) {
		currentAddress.sendKeys(Cadd);
	}

	public void userClickOnState() {
		clickstate.click();
	}

	public void selectStateOnDropdown()
	{
		SelectState.click();
	}

	public void userClickOnCity() {
		ClickCity.click();
	}

	
	public void selectCityOnDropdown()
	{
		SelectCity.click();
	}
	
	
	public void userClicksOnSubmitButton()
	{
		submitButton.click();
	}
	
	
	public void userNavigateOnSubmitionForm()
	{
		String TextOfSumitionForm=navSubmitionForm.getText();
		log.info("Text of submition form "+TextOfSumitionForm);
	}
	
	
	public void verifyTheSubmitionForm(String text) {
		
		Assert.assertEquals(verifySubmitionForm.getText(),text,"user is not submition page");
		log.info("text of submition form" +text);
	}
	
	public void clickOnCloseButon()
	{
		closeButton.click();
	}
	

	
}
