package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void calls() {
		Reporter.log("calls",true);
		
	}
	@Test(priority = 1)
	public void setting() {
		Reporter.log("setting",true);
	}
	@Test(priority = 1)
	public void exit() {
		Reporter.log("exit",true);
	}
	@Test(priority = -1)
	public void chats() { 
		Reporter.log("chat",true);
	}
	}
