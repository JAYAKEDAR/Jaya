package com.hybridframework.projectobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")

	WebElement username;

	@FindBy(name = "password")

	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement Loginbtn;

	public void username() {

		username.clear();
		username.sendKeys("mngr341390");

	}

	public void password() {

		password.clear();
		password.sendKeys("vYmajuh");

	}

	public void Loginbtn() {
		Loginbtn.click();
	}

}
