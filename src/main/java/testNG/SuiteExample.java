package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	public static long startTime;
	public static long endTime;
	public static long totaltime;
	public static WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		 driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {


		driver.get("https://www.google.com");

	}
	@Test
	public void openBing() {


		driver.get("https://www.bing.com");

	}
	@Test
	public void openFacebook() {


		driver.get("https://www.facebook.com");


	}
	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
		endTime = System.currentTimeMillis();

		totaltime= endTime - startTime;
		
		System.out.println(totaltime);
	}

}
