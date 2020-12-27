package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import inetbankiing.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig= new ReadConfig();

	public String baseURL=readConfig.getApplicationURL();
	public String username=readConfig.getUserName();
	public String password=readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) 
	{
		logger= Logger.getLogger("inetbanking");

		PropertyConfigurator.configure("log4j.properties");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readConfig.getChromepath());
			driver=new ChromeDriver();

		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readConfig.getFirefoxpath());
			driver=new FirefoxDriver();

		}
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	


}
