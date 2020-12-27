package SeleniumInterviewQuestions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
  @Test(invocationCount = 2)
  public void f() {
	  
	  System.out.println("I am Test 1");
  }
  @Test
  public void f1() {
	  
	  System.out.println("I am Test 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am After Suite");
  }

}
