package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB1 {
	WebDriver driver;

	@Parameters({ "browserName" })
	@Test
	public void openApp(String browser) {
		if (browser.equals("chrome")) {

			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("email")).sendKeys("gurunathyemul");
		driver.findElement(By.id("pass")).sendKeys("Gurunath@233");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getTitle(), true);
		Reporter.log(driver.getCurrentUrl(), true);

		driver.close();
	}

}
