package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test0 {
@Test
public void demo() {
	Reporter.log("hello",true);
	Reporter.log("bro",false);
	Reporter.log("bro",false);
}
@Test(priority = -1)
public void test() {
	Reporter.log("hii",true);
}
}
