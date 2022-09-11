package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB {
@FindBy(id="email")
private WebElement usernametb;
@FindBy(id="pass")
private WebElement password;
@FindBy(xpath = "//button[contains(@class,'_42ft ')]")
private WebElement login;

public FB(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void usernameTB(String name) {
	usernametb.sendKeys(name);
}
public void passwordTB(String pass) {
	password.sendKeys(pass);
}
public void loginFN() {
	login.click();
}
}
