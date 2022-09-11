package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTC3 {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(invocationCount = 2)
	public void forgotPassword() throws InterruptedException {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("12345");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(3000);		
		Reporter.log(driver.getTitle(), true);
		Reporter.log(driver.getCurrentUrl(), true);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
