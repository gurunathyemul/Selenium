package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test5 {
	@Test(invocationCount = 2)
	public void calls() {
		Reporter.log("calls",true);
	}
	@AfterClass
	public void setting() {
		Reporter.log("setting",true);
	}
	@AfterSuite
	public void exit() {
		Reporter.log("exit",true);
	}
}
