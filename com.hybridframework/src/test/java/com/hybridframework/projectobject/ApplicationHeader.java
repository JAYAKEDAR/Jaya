package com.hybridframework.projectobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	WebDriver driver;

	public ApplicationHeader(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/test/newtours/']")
	WebElement newTour;

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/payment-gateway/index.php']")
	WebElement Paymentgatewayproject;

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/telecom/index.html']")
	WebElement Telecomproject;

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']")
	WebElement Securityproject;

	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")
	WebElement Bankproject;

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/Agile_Project/Agi_V1/']")
	WebElement Agileproject;

	@FindBy(xpath = "//a[@href='http://demo.guru99.com/insurance/v1/index.php']")
	WebElement Insuranceproject;

	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")
	WebElement Selenium;

	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")
	WebElement SEO;

	public void Selenium() {
		Selenium.click();
	}

	public void Insuranceproject() {
		Insuranceproject.click();
	}

	public void Agileproject() {
		Agileproject.click();
	}

	public void Bankproject() {
		Bankproject.click();
	}

	public void Securityproject() {
		Securityproject.click();
	}

	public void Telecomproject() {
		Telecomproject.click();
	}

	public void Paymentgatewayproject() {
		Paymentgatewayproject.click();
	}

	public void newTour() {
		newTour.click();
	}

	public void SEO() {
		SEO.click();
	}

}
