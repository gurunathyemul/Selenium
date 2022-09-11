package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test(invocationCount = 2)
	public void calls() {
		Reporter.log("calls",true);
		
	}
	@Test(priority = 1,invocationCount = 3,enabled = false)
	public void setting() {
		Reporter.log("setting",true);
	}
	@Test(priority = 1)
	public void exit() {
		Reporter.log("exit",true);
	}

}
