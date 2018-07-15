package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPagePOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='login-form-username']")
	WebElement LoginFormUsername;
	
	@FindBy(xpath=".//*[@id='login-form-password']")
	WebElement LoginFormPassword;
	
	@FindBy(xpath=".//*[@id='login-form-submit']")
	WebElement LoginFormSubmit;


public LoginPagePOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void sendkeysLoginFormUsername(String username) {
	LoginFormUsername.sendKeys(username);
}
public void sendkeysLoginFormPassword(String password) {
	LoginFormPassword.sendKeys(password);
}
public void clickLoginFormSubmit() {
	LoginFormSubmit.click();

}
}