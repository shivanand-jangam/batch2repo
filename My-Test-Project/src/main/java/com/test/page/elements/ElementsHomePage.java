package com.test.page.elements;

import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.base.DriverManager;

public class ElementsHomePage {

	public ElementsHomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(ElementsHomePage.class);

}
