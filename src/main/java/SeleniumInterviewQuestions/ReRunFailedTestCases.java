package SeleniumInterviewQuestions;

import javax.management.RuntimeErrorException;
import javax.swing.JSpinner.ListEditor;

import org.testng.annotations.Test;

import bsh.NameSource.Listener;

public class ReRunFailedTestCases {
	
	@Test(retryAnalyzer= Retryclass.class)
	public void firstTestCase() {

		System.out.println("This is the first Testcase");

	}
    @Test
	public void secondTestCase() {

		System.out.println("This is the second Testcase");
		throw new RuntimeErrorException(null);
		

	}
    @Test
	public void thirdTestCase() {

		System.out.println("This is the third Testcase");
		throw new RuntimeErrorException(null);
	}
    @Test
	public void fourthTestCase() {

		System.out.println("This is the fourth Testcase");

	}

}
