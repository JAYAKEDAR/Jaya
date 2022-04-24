package com.hybridframework.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameter;
import com.hybridframework.utility.ConfigDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	
	static String configdatapath = "./Config/config.properties";
	
	
	public ConfigDataProvider configDataProvider;
	@BeforeSuite
	public void init() 
	{
		configDataProvider = new ConfigDataProvider(configdatapath);
	}

	@BeforeTest


	public void setUp(@Optional("Chrome") String brName) {

		if (brName.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (brName.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else {

			System.out.println("browser not matched check with expected browser");
		}

		driver.manage().window().maximize();
		driver.get(configDataProvider.getUrl());
	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}
}
