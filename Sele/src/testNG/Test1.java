package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
@Test(priority = -1)
public void calls() {
	Reporter.log("calls",true);
	
}
@Test
public void setting() {
	Reporter.log("setting",true);
}
@Test(priority = 1)
public void chats() { 
	Reporter.log("chat",true);
}
}
