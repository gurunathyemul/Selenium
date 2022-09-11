package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class skillararyPract {
	 WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void Mousehover() {
		WebElement a = driver.findElement(By.xpath("(//i[contains(@class,'fa ')])[2]"));
	Actions b=new Actions(driver);
	b.moveToElement(a).perform();
	driver.findElement(By.xpath("(//a[text()=' HTML Editor'])[1]")).click();
	Reporter.log(driver.getCurrentUrl()+" "+driver.getTitle());
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
