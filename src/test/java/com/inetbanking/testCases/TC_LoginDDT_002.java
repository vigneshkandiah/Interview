package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import inetbankiing.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass 

{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) {

		LoginPage lp= new LoginPage(driver);
		lp.setUserName(user);
		logger.info("User is provided");
		lp.setPassword(pwd);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}else
		{
			
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn("Login is Passed");
			
		}
		
	}
	//to check Alert is Prsent or Not
	public boolean isAlertPresent() {
		
		try {
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e){
			return false;
		}
		
		
	}
	
	public void hideElement()
	{
	    WebElement element = driver.findElement(By.xpath("//*[@id='closeBtn']"));       
	    element.click();
	}

	@DataProvider(name="LoginData")
	String [][]getData() throws IOException
	{
//		String path ="./com/inetbanking/testData/LoginData.xlsx";
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colCount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]= new String [rownum][colCount];
		for (int i = 1; i <=rownum ; i++) {

			for (int j = 0; j < colCount; j++) {

				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);


			}

		}

		return logindata;

	}

}
