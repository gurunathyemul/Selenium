package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("gurunathyemul"); 
		driver.findElement(By.id("pass")).sendKeys("Gurunath@233");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
	String	d="fb";
//	Assert.assertEquals(title,d);-----//hard assert

		SoftAssert a=new SoftAssert();
		a.assertEquals(title, "hello");
		Reporter.log(title, true);
		Reporter.log(driver.getCurrentUrl(), true);
		a.assertAll();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
